# User Management App springdoc-openapi With Swagger UI

* Add `springdoc-openapi-ui` dependency to our pom.xml
* Then when we run our application, the OpenAPI descriptions will be available at the path /v3/api-docs by default:
    > http://localhost:8082/v3/api-docs/

* To use a custom path, we can indicate in the application.properties file:
    > springdoc.api-docs.path=/api-docs
  
* Then we can access docs at:
  > http://localhost:8082/api-docs/
  
*The OpenAPI definitions are in JSON format by default. For yaml format, we can obtain the definitions at:
  > http://localhost:8082/api-docs.yaml

* Now We can access swagger ui by:
  > http://localhost:8082/swagger-ui/index.html
  
* We can  customize the path of our API documentation. We can do this by modifying our application.properties to include:
  > springdoc.swagger-ui.path=/swagger-ui-custom.html
  
* To sort the API paths in order of their HTTP methods, we can add:
  > springdoc.swagger-ui.operationsSorter=method
* We can create actuator endpoint using controller end point. The end point will be added in actator. We can access it by below url where `message-from-solar` is get method
    > http://localhost:8082/actuator/controllerEndPoint/message-from-solar
  
* Use spring security to securing the actuator acess. By defualt it allow /health and /info.