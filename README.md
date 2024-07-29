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

## Diagrama

<p align="center">
    <img src="/img/imagen.png">
</p>
