# # DOCKERFILE IN A SINGLE STAGE
#FROM openjdk:12-jdk-alpine
#LABEL maintainer="maintainer@company.com"
#EXPOSE 8282
#ARG JAR_FILE=target/*.jar
#ADD ${JAR_FILE} backend-swagger-aggregator.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/backend-swagger-aggregator.jar"]

# DOCKERFILE MULTIPLE STAGES
FROM openjdk:16-jdk-alpine AS builder
LABEL maintainer="maintainer@company.com"
WORKDIR application
COPY mvnw .
COPY .mvn .mvn
COPY . .
RUN ./mvnw --projects swagger-aggregator --also-make clean install -DskipTests

FROM openjdk:16-jdk-alpine AS runner
COPY --from=builder /application/swagger-aggregator/target/*.jar /application/backend-swagger-aggregator.jar
EXPOSE 8282
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/application/backend-swagger-aggregator.jar"]