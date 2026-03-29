FROM gradle:8.8-jdk11 AS build

WORKDIR /workspace
COPY build.gradle settings.gradle ./
COPY src ./src
RUN gradle clean build --no-daemon

FROM eclipse-temurin:11-jre
WORKDIR /app
COPY --from=build /workspace/build/libs/ci-helloworld-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
