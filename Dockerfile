FROM eclipse-temurin:17
COPY target/sample.jar sample.jar
CMD [ "java","-jar","sample.jar" ]