FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests
WORKDIR /app
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /app/target/Hiragana-0.0.1-SNAPSHOT.jar Hiragana.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "hiraganaback.jar"]


