FROM maven:3.9.6-eclipse-temurin-17-alpine AS maven
RUN mvn clean package --quiet
COPY *.jar /app

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=maven /app/target/spring-boot-app.jar /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/spring-boot-app.jar"]
