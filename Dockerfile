FROM openjdk:8
ADD target/micrometer-prometheus-springboot.jar docker-spring-boot.jar
ARG port
EXPOSE $port
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]