FROM maven:3.9.6-eclipse-temurin-17-alpine AS maven
COPY src .
COPY pom.xml .
WORKDIR .
RUN mvn clean package --quiet

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=maven /target/java-app.jar .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/java-app.jar"]
