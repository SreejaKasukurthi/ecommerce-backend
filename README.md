# 🛒 E-Commerce Backend (Spring Boot + JWT)

## 🚀 Overview

A secure e-commerce backend built using Spring Boot, Hibernate (JPA), and MySQL with JWT-based authentication. The application provides REST APIs for managing users, products, and orders.

---

## 🧰 Tech Stack

* Java 17
* Spring Boot
* Hibernate (JPA)
* MySQL
* Spring Security
* JWT Authentication

---

## ✨ Features

* Full CRUD APIs (User, Product, Order)
* JWT-based authentication 🔐
* Secure REST endpoints
* Entity relationships (@OneToMany, @ManyToOne)

---

## 🔐 Authentication Flow

1. Login using `/auth/login`
2. Receive JWT token
3. Use token in headers:
   Authorization: Bearer <token>

---

## 📌 API Endpoints

* POST /auth/login
* GET /orders
* POST /orders
* PUT /orders/{id}
* DELETE /orders/{id}

---

## 💼 Resume Highlight

Developed a secure e-commerce backend using Spring Boot, Hibernate, and MySQL with JWT authentication and full CRUD operations.
