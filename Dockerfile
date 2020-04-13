FROM openjdk
EXPOSE 9090
WORKDIR /
ADD target/spring-rest-example-0.0.1.jar spring-rest-example-0.0.1.jar
ADD docker-entrypoint.sh docker-entrypoint.sh
ENTRYPOINT ["./docker-entrypoint.sh"]
