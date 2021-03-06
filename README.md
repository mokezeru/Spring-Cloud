## ConfigServer URL
* http://localhost:8888/config-server-client/development
* http://localhost:8888/config-server-client/production 

## ConfigServer-repo location
```
C:\\Charter\\SpringCloud\\configServer-repo 
```

## ConfigClient URL
* http://localhost:8080/msg

## Config files in the repo
```
- config-server-client.properties
- config-server-client-development.properties
- config-server-client-production.properties
```

## Eureka URL
* http://localhost:8761

## Admin URL
* http://localhost:8761/admin

## TO access StudentServie API dierectly
* http://localhost:8098/getStudentDetailsForSchool/abcschool

## To access SchoolServie API directly
* http://localhost:9098//getSchoolDetails/abcschool

## To access EmployeeService directly
* http://localhost:8011/findEmployeeDetails/111

## Eureka Client SchoolServie API to check Hystrix
* http://localhost:9098//getSchoolDetailsDelegate/abcschool

## Hystix dashboard URL for SchoolService
* http://localhost:9098//hystrix

## Hystix dashboard URL for ZuulGateway
* http://localhost:8081/hystrix

## Hystrix Stream for SchoolService
* http://localhost:9098//actuator/hystrix.stream

## To access the StudentServcie via the Zuul Gateway using Eureka service name
* http://localhost:8081/student-service/getStudentDetailsForSchool/abcschool

## To access the EmployeeServcie via the Zuul Gateway using Eureka service name
* http://localhost:8081/employee-service/findEmployeeDetails/111

## To run the Zipkin Server
```
java -jar zipkin-server-2.12.9-exec.jar
```

## To access Zipkin Server Dashboard
* http://localhost:9411/zipkin/

## To access Zipkin Services
* http://localhost:8082/service1
* http://localhost:8083/service2
* http://localhost:8084/service3

## Run ribbon backend services/ribbonServer at Port 9091,9092,9093
#### To access ribbon backend services directly ####
* http://localhost:9091/backend
* http://localhost:9092/backend
* http://localhost:9093/backend

## To access ribbon backend services via from ribbon client load balanced and see the effect
* http://localhost:9090/client/frontend

## To access EmployeeService
* http://localhost:8011/findEmployeeDetails/111
