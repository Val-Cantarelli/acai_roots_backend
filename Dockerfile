# First stage: JDK with GraalVM
# doc
#FROM ghcr.io/graalvm/jdk:22.3.2 AS build
FROM ghcr.io/graalvm/graalvm-ce:ol8-java11-22.3.3

# Update package lists and Install Maven
RUN microdnf update -y && \
microdnf install -y maven gcc glibc-devel zlib-devel libstdc++-devel gcc-c++ && \
microdnf clean all

WORKDIR /usr/src/app

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

COPY . .

RUN mvn -Pnative -Pproduction native:compile

#Second stage: Lightweight debian-slim image
FROM debian:bookworm-slim

WORKDIR /app

# Copy the native binary from the build stage
COPY --from=build /usr/src/app/target/schedulemanagement/app/schedulemanagement

#Run the application
CMD ["/app/schedulemanagement"]