FROM maven:3.6-jdk-8-alpine AS maven
WORKDIR /app
COPY . /app
RUN mvn clean package

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=maven /app/target/spring-boot-app.jar /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/spring-boot-app.jar"]
