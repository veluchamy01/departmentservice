FROM openjdk:11
VOLUME /tmp
EXPOSE 9001
ADD target/DepartmentService-0.0.1-SNAPSHOT.jar DepartmentService-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/DepartmentService-0.0.1-SNAPSHOT.jar"]