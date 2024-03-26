FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests
WORKDIR /app
FROM openjdk:17.0.1-jdk-slim
COPY --from=build kana-crazy/target/kana-crazy-1.0-SNAPSHOT.jar kana-crazy.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "kana-crazy.jar"]
