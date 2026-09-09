# java-full-stack-intership
# Java Full Stack Internship

## Domain Model, Layer Boundaries & Architecture Decisions

### 1. Domain Model

The application is designed using a layered architecture.

Main entities:

- User
- Product
- Order
- Payment

### 2. Layer Boundaries

The project is divided into the following layers:

1. Presentation Layer
   - Handles user requests and responses.

2. Controller Layer
   - Receives HTTP requests and communicates with the service layer.

3. Service Layer
   - Contains business logic and application rules.

4. Repository Layer
   - Handles database operations.

5. Database Layer
   - Stores and manages application data.

### 3. Architecture Decisions

- Used layered architecture for better separation of responsibilities.
- Business logic is kept inside the service layer.
- Database operations are handled by the repository layer.
- Controllers are kept lightweight.
- The structure makes the application easier to maintain, test and extend.

## Conclusion

This architecture provides clear separation between different responsibilities and supports scalable Java Full Stack application development.



## Spring Boot REST API & Hibernate/JPA

This project demonstrates a basic Spring Boot REST API with Hibernate/JPA persistence.

### Features
- Create student records using POST API
- Retrieve student records using GET API
- Hibernate/JPA for database persistence
- H2 database for development
- RESTful API architecture

### API Endpoints

GET /students
- Retrieves all students.

POST /students
- Adds a new student.

### Technologies
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- REST API



## Spring Security 6 with JWT Authentication

This project demonstrates authentication and authorization using
Spring Security 6 and JWT tokens.

### Security Features

- Spring Security 6
- JWT-based authentication
- Protected REST API endpoints
- Public login endpoint
- Authentication required for protected resources

### Authentication Flow

1. User submits login credentials.
2. Server validates the credentials.
3. A JWT token is generated.
4. Client sends the JWT token with subsequent requests.
5. Spring Security validates the token before allowing access.