# spring-boot-microservices-new ETS
## _ETS_PPLBO_54_
### Muhamad Aryadipura 3B-D4TI

Cafe Royale - Cafe Microservices with springboot untuk pengumpulan ETS PPLBO
Teknologi yang digunakan :
- Java
- Springboot

Pattern yang diterapkan : Circuit Breaker Pattern

## Service yang tersedia

- API Gateway
- Discovery Service
- Product Service (MongoDB)
- Order Service (MySQL)

## Rest API

List endpoint dan method pada setiap service

| Service | Method | endpoint |
| ------- | ------ | -------- |
| Product | GET | http://localhost:8080/api/product |
| Product | POST | http://localhost:8080/api/product |
| Order | POST | http://localhost:8081/api/order |
| Order | GET | http://localhost:8081/api/order |


## Installation

Requires IntelliJ IDE to run
Install the dependencies and start the server.

Urutan menjalankan server :
1. API Gateway
2. Discovery Service
3. Product Service
5. Order Service

