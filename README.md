# G51 Email API Project

## Description

This project is a simple RESTful email management API built using **Spring Boot**, **MariaDB**, and **Java 21**. The main purpose of the API is to allow users to send and manage emails, providing functionalities to create, send, and retrieve emails. It follows a layered architecture, separating concerns into different components to ensure maintainability and scalability.

### Current Features:
- [x] Controller: Handles HTTP requests for creating and sending emails.
- [x] Integrated **MariaDB** for database management.
- [x] Service: Manages the business logic for emails.
- [x] Repository: Interfaces with the database for email storage.
- [x] Basic RESTful API routes for creating and retrieving emails.


## Project Structure


g51-email-api/


├── src/

- │├── main/
- │   │   ├── java/se/alex/lexicon/g51emailapi/
- │   │   │   ├── config/            # Configurations for the mail setup and security.
- │   │   │   ├── controller/        # REST API controllers (handles HTTP requests).
- │   │   │   ├── domain/            # Entity classes (Email, User, etc.).
-  │   │   │   ├── dto/               # Data transfer objects to simplify interactions between layers
-    │   │   │   ├── repository/        # Interfaces for database access using Spring Data JPA.
- │   │   │   ├── service/           # Business logic related to email operations.
- │   │   │   └── util/              # Utility classes for email and security.
- │   ├── resources/
- │   │   ├── application.properties # Application-level configurations (DB, mail, etc.)
 -│   └── test/
- │       └── ...                    # Unit tests (to be implemented).
- └── pom.xml                         # Project dependencies and build configuration.



## API Endpoints

| Method | Endpoint               | Description                     |
|--------|------------------------|---------------------------------|
| POST   | `/api/emails`           | Create and send a new email     |
| GET    | `/api/emails`           | Retrieve all emails             |
| GET    | `/api/emails/{id}`      | Retrieve a specific email by ID |
