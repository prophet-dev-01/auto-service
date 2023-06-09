# 🪒AutoService

AutoService is a RESTful API server for managing an auto service business. It allows you to store data about cars, owners, orders, and services, as well as calculate salaries for masters and discounts for customers.


## 🎥Application presentation
 [Click here to watch the presentation](https://www.loom.com/share/2ee08e76afde44169e440f270eb2c28b)

## ✨Features
- Create, read, update, and delete entities such as masters, cars, owners, orders, services, and products.
- Get orders of a particular master or customer.
- Calculate salary for a master based on the cost of the service they worked on.
- Apply discounts to customers based on the number of their orders.
- Support for a free diagnostic service when a customer agrees to repair their car.

## 🔨Technologies
- ☕Java 
- Spring Boot JPA, MVC
- Hibernate
- PostgreSQL
- Swagger UI

## ⚡️Getting Started
1. Clone the repository
2. Install dependencies:
```
cd autoservice
mvn install
```
3. Set up the PostgreSQL database and edit the configuration in "application.properties" file
``` java
spring.datasource.url=YOUR_DATABASE_URL
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```
4. Run the server:
```
mvn spring-boot:run
```
5. Open the Swagger UI in your browser:
``` link
http://localhost:8080/swagger-ui/#/
```
