FROM eclipse-temurin:17-jre-alpine
ENV JAR_FILE="docker.training.demo-0.0.1-SNAPSHOT.jar"
COPY ${JAR_FILE} docker-training-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/docker-training-demo.jar"]
