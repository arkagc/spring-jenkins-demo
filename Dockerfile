FROM openjdk
MAINTAINER arka ghosh chowdhury
WORKDIR /usr/src/myspringjenkinsapp
COPY . /usr/src/myspringjenkinsapp/
CMD [ "java" , "-jar", "jenkins-demo-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081
ADD target/jenkins-demo-0.0.1-SNAPSHOT.jar jenkins-demo-0.0.1-SNAPSHOT.jar