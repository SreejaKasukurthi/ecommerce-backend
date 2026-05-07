# 🛒 E-Commerce Backend Application

## 🚀 Overview
A secure and scalable E-Commerce Backend Application built using Java, Spring Boot, Hibernate (JPA), and MySQL with JWT-based authentication and RESTful APIs for managing products, users, and orders.

---

## 🌐 Live Deployment

Backend API Base URL:

```bash
https://ecommerce-backend-production-9006.up.railway.app
```

### Example Endpoint

```bash
GET /products
```

---

## 🧰 Tech Stack

- Java 17
- Spring Boot
- Spring Security
- JWT Authentication
- Hibernate (JPA)
- MySQL
- Maven
- Railway Cloud Deployment
- Git & GitHub
- Postman

---

## ✨ Features

- JWT-based Authentication & Authorization 🔐
- Secure RESTful APIs
- CRUD Operations for Products, Users, and Orders
- Protected Endpoints using Spring Security
- Cloud-hosted MySQL Database
- Online Deployment with Railway
- Layered Architecture (Controller-Service-Repository)
- API Testing using Postman

---

## 🔐 Authentication Flow

### Login Endpoint

```bash
POST /auth/login
```

### Sample Request

```json
{
  "username": "admin",
  "password": "admin"
}
```

### Sample Response

```json
{
  "token": "your_jwt_token"
}
```

### Authorization Header

```bash
Authorization: Bearer <JWT_TOKEN>
```

---

## 📌 API Endpoints

### Authentication
- POST `/auth/login`

### Products
- GET `/products`
- GET `/products/{id}`
- POST `/products`
- DELETE `/products/{id}`

### Users
- GET `/users`
- GET `/users/{id}`
- POST `/users`

### Orders
- GET `/orders`
- POST `/orders`
- PUT `/orders/{id}`
- DELETE `/orders/{id}`

---

## 📂 Project Structure

```bash
src/main/java/com/ecommerce
│
├── config
├── controller
├── dto
├── entity
├── repository
├── service
```

---

## 🧪 API Testing

APIs were tested using Postman for:
- CRUD Operations
- JWT Token Generation
- Protected Route Access
- Online Database Persistence
- Request & Response Validation

---

## ☁️ Deployment

The backend application was deployed on Railway using GitHub integration and automated deployment workflow.

---

## 💼 Resume Highlights

- Developed and deployed a backend-focused E-Commerce Application using Java, Spring Boot, MySQL, and REST APIs with JWT-based authentication and role-based access handling.

- Designed and implemented CRUD operations for Products, Users, and Orders modules using Spring Boot, Spring Data JPA, and Hibernate for efficient database interaction.

- Integrated JWT Authentication and Spring Security to secure protected APIs, enabling token-based authorization for user and order management endpoints.

- Built scalable RESTful APIs for product management, user handling, order processing, and authentication workflows following backend architecture best practices.

- Configured and connected a cloud-hosted MySQL database with Railway deployment, enabling persistent online data storage and real-time API accessibility.

- Deployed the backend application on a cloud platform using GitHub integration and automated deployment workflow, making APIs publicly accessible through live deployment URLs.

- Implemented API testing and validation using Postman to verify CRUD operations, JWT token generation, protected route access, and database persistence.

- Managed application configuration, environment setup, and deployment troubleshooting involving Spring Boot runtime, Maven builds, and cloud database connectivity.

---
