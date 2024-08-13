FROM eclipse-temurin:21-jdk as BuildJava
COPY src ./src
COPY gradle ./gradle
COPY build.gradle settings.gradle gradlew ./
RUN (chmod +x gradlew)
RUN (./gradlew clean build --warn)

FROM eclipse-temurin:21-jre as BuildImage
COPY build/libs/*.jar /app.jar
ENTRYPOINT ["java","-jar","app.jar"]
