FROM bellsoft/liberica-runtime-container:jre-17-stream-musl
COPY target/*.jar jenkins-demo.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/jenkins-demo.jar"]
