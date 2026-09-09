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