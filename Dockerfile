
ARG HERMES_DIR=/home/app/hermes

#
# Building stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY . ${HERMES_DIR}
RUN mvn -f ${HERMES_DIR}/libs/binance-java-api-master/pom.xml install -DskipTests
RUN mvn -f ${HERMES_DIR}/pom.xml clean package -DskipTests

#
# Package stage
#
FROM openjdk:12
COPY --from=build ${HERMES_DIR}/target/*.jar /application.jar
ENTRYPOINT ["java", "-jar", "/application.jar"]