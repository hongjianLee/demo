FROM adoptopenjdk/openjdk8-openj9:alpine-slim

MAINTAINER 772147079@qq.com

RUN mkdir -p /com/medi

WORKDIR /com/medi

EXPOSE 8105

ADD ./target/demo-service.jar ./app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]

CMD ["--spring.profiles.active=test"]
