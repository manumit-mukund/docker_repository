# FROM openjdk

FROM eclipse-temurin:21-jdk

WORKDIR /usr/src/myjavaapp

COPY . /usr/src/myjavaapp

RUN javac HelloWorld.java

CMD [ "java" , "HelloWorld"]