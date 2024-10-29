FROM maven:3.9.6-eclipse-temurin-17-alpine AS maven
WORKDIR /build
COPY . .
RUN mvn clean package --quiet

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=maven /build/target/java-app.jar .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/java-app.jar"]
