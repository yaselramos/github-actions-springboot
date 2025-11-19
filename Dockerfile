FROM eclipse-temurin:17-alpine
EXPOSE 8090
ADD target/api-springboot-new.jar api-springboot-new.jar
ENTRYPOINT ["java","-jar","/api-springboot-new.jar"]