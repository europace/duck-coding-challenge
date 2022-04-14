FROM openjdk:11 as BuildJava
COPY src ./src
COPY gradle ./gradle
COPY build.gradle settings.gradle gradlew ./
RUN (chmod +x gradlew)
RUN (./gradlew clean build --warn)

#cause fabric8 provides also ARM tags...
FROM fabric8/java-alpine-openjdk11-jre as BuildImage
COPY --from=0 ./build/libs/app.jar ./
ENTRYPOINT ["java","-jar","app.jar"]
