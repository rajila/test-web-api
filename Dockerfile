FROM openjdk:8

ADD target/test-spring.jar test-spring.jar 

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "test-spring.jar"]