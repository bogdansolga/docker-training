FROM openjdk:8-jdk-alpine
ENV JAR_FILE="docker.training.demo-0.0.1-SNAPSHOT.jar"
COPY ${JAR_FILE} docker-training-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/docker-training-demo.jar"]
