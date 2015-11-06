# A demo project for springboot with scala and java 

This is a simple demo project for using springboot (spring mvc) with undertow and scala, see details in the pom.xml

## run

    mvn spring-boot:run

## package

    mvn clean package
    
## run standalone jar

    java -jar target/demo-0.0.1-SNAPSHOT.jar com.example.App

## test
You can test in your browser with below routes:

    localhost:8888/reverse?name=xxx
    localhost:8888/random?seed=[some_long_number]

## tips
- If you are running with jrebel, you can modify code and see changes with out restart server

- This project uses java8, you can modify it in the pom.xml properties <java.version>

