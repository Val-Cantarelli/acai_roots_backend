FROM openjdk:17
WORKDIR /app
RUN microdnf update -y && \
    microdnf install -y maven
COPY . .
EXPOSE 8080

#RUN mvn de.qaware.maven:go-offline-maven-plugin:resolve-dependencies package

CMD ["mvn", "spring-boot:run"]