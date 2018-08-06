Api versioning using swagger
===========================

Different Approches for API versioning
-------------------------------------
- Through an URI Path - you include the version number in the URL path of the endpoint , ex /api/v1/orders
- Through query parameters – you pass the version number as a query parameter with specified name, for example /api/orders?version=1
- Through Http header - define a new header that contains the version number in the request
- Through a content negotiation the version number is included to the “Accept” header together with accepted content type
  ex  curl -H "Accept: application/vnd.api.v1+json" http://localhost:8080/api/orders.
  
 ## Enable swagger in Spring BOOT app
 - Include SpringFox dependecies from maven .
 - io.springfox:springfox-swagger-ui, io.springfox:springfox-swagger2, io.springfox:springfox-spring-web .
 - Annotate the springBoot Starter class with @EnableSwagger2 and define docket object.
