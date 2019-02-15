FROM alpine/git
WORKDIR /app
RUN git clone https://github.com/bogdansolga/docker-training

FROM maven:3.5-jdk-8-alpine
WORKDIR /app
COPY --from=0 /app/docker-training/docker-training-demo /app
RUN mvn clean package

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=1 /app/target/docker-training-demo.jar /app
ENTRYPOINT ["java -jar docker-training-demo.jar"]

#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "/docker-training-demo.jar"]
