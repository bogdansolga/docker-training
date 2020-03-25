FROM alpine/git AS git
WORKDIR /app
RUN git clone https://github.com/bogdansolga/docker-training

FROM maven:3.6-jdk-8-alpine AS maven
WORKDIR /app
COPY --from=git /app/docker-training/docker-training-demo /app
RUN mvn clean package

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=maven /app/target/docker-training-demo.jar /app
ENTRYPOINT ["java", "-jar", "/app/docker-training-demo.jar"]

# docker build -t building-a-java-app-in-a-container .
# docker run --detach --publish 8080:8080 --name building-a-java-app-in-a-container building-a-java-app-in-a-container
