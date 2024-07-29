## Installation
### Step 1: Clone the repository

git clone https://github.com/juanzch/Employability-Evaluation.git

### Step 2: Create database

CREATE DATABASE employability_evaluation;

### Step 3: Configure src/main/resources/application.properties.

spring.datasource.username= tu-usuario 
spring.datasource.password= tu-contraseña

### Step 4: Build and run project

mvn clean install mvn spring-boot:run

### Step 5: Documentation

http://localhost:8080/api/v1/swagger-ui/index.html

## Problem solving
To solve this issue, we established three core concepts (entities): Coupons, Users, and Products.
A User can have multiple Coupons, but a Coupon can only belong to one User. This is a many-to-one relationship.
The characteristics (attributes) of these entities are simple.
We've implemented eight different access points (endpoints) to interact with this system:

1. For registering new users.
2. To create new coupons.
3. To modify existing coupons.
4. To remove coupons that have not been used.
5. To check if a coupon is valid.
6. To use (redeem) a coupon.
7. To view a history of all coupons used by a specific user.
8. To display a list of all products.

## Diagram

<p align="center">
    <img src="/img/image.png">
</p>

<p align="center">
    <img src="/img/Domain.png">
</p>
