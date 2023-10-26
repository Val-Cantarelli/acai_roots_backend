FROM openjdk:17
WORKDIR /app
RUN microdnf update -y && \
    microdnf install -y maven
COPY . .

RUN mvn package
EXPOSE 8080

CMD ["mvn", "spring-boot:run"]