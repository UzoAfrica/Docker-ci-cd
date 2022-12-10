FROM openjdk:11
EXPOSE 8080
ADD target/ibezimuzo.github-new.jar ibezimuzo.github-new.jar
ENTRYPOINT ["java", "-jar", "/ibezimuzo.github-new.jar"]