FROM openjdk
WORKDIR /usr/src/myapp
COPY . /usr/src/myapp

CMD ["java","-jar","product-details-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 9002