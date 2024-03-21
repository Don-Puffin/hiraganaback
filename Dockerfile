FROM eclipse-temurin:17-jdk-focal
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY kana-crazy/src/main/java/org/example/ ./src/main/java/org/example/

CMD ["./mvnw", "spring-boot:run"]