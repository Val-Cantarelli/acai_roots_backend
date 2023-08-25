# First stage(base): JDK with GraalVM
# Cria um container a partir dessa imagem: ghcr.io/graalvm/graalvm-ce:ol8-java11-22.3.3 AS <nome da nova imagem criada a partir dessa>
FROM ghcr.io/graalvm/graalvm-ce:ol7-java17 AS build


# Update package lists and Install Maven

RUN yum update -y && \
    yum install -y unzip wget && \
    wget https://dlcdn.apache.org/maven/maven-3/3.9.4/binaries/apache-maven-3.9.4-bin.zip &&  \
    unzip apache-maven-3.9.4-bin.zip && \
    yum install -y gcc glibc-devel zlib-devel libstdc++-devel gcc-c++ && \
    yum clean all


WORKDIR /usr/src/app
ENV PATH=$PATH:/app/apache-maven-3.9.4/bin/
# Copy pom.xml do host para o container(o ponto indica o dir atual - no caso /usr/src/app)

COPY pom.xml .

RUN mvn dependency:go-offline
RUN yum install -y freetype-devel

#Copia o dir atual do host para o diretório atual dentro do container
COPY . .


# Compilo o que foi copiado para binário(nativo) Ps: quando o container faz isso, ele já faz de acordo com a arquitetura,
# por exemplo, desktop, IOS
RUN mvn -Pnative -Pproduction -DskipTests native:compile


#Second stage: Lightweight debian-slim image
FROM debian:bookworm-slim
WORKDIR /app

# Copy the native binary(schedulemanagement - que é o proprio projeto) from the build stage
COPY --from=build /usr/src/app/target/schedulemanagement .

#Run the application
CMD ["/app/schedulemanagement"]