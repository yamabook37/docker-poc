FROM maven:3.8.4-jdk-11 AS builder
WORKDIR /tmp
COPY ./src ./src
COPY ./pom.xml .
RUN mvn package

FROM openjdk:11.0.14.1-oracle
COPY --from=builder /tmp/target/api.jar /api/api.jar
EXPOSE 8080