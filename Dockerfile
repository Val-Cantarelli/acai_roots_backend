FROM openjdk:17
WORKDIR /app
RUN microdnf update -y && \
    microdnf install -y maven
COPY . .
#ARG MONGO_URI
#ENV MONGO_URI $MONGO_URI

RUN mvn package
EXPOSE 8080


#RUN mvn de.qaware.maven:go-offline-maven-plugin:resolve-dependencies package

CMD ["mvn", "spring-boot:run"]