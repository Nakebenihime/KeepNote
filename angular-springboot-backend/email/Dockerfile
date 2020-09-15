# DOCKERFILE IN A SINGLE STAGE
#FROM openjdk:12-jdk-alpine
#LABEL maintainer="maintainer@company.com"
#EXPOSE 8181
#ARG JAR_FILE=target/*.jar
#ADD ${JAR_FILE} backend-email.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/backend-email.jar"]

# DOCKERFILE IN MULTIPLE STAGES
FROM openjdk:16-jdk-alpine AS builder
LABEL maintainer="maintainer@company.com"
WORKDIR application
COPY mvnw .
COPY .mvn .mvn
COPY . .
RUN ./mvnw --projects email --also-make clean install -DskipTests

FROM openjdk:16-jdk-alpine AS runner
COPY --from=builder /application/email/target/*.jar /application/backend-email.jar
EXPOSE 8282
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/application/backend-email.jar"]