FROM openjdk:8-jre-alpine
EXPOSE 8085
ADD target/kubernetes-hello-world-local-1.0.jar kubernetes-hello-world-local.jar
ENTRYPOINT ["java","-jar","kubernetes-hello-world-local.jar"]