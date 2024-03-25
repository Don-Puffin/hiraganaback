FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests
WORKDIR /app
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/hiraganaback-0.0.1-SNAPSHOT.jar hiraganaback.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "hiraganaback.jar"]


