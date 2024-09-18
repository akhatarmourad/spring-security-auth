# JWT Authentication with Spring Security

## Overview

This project implements JWT (JSON Web Token) authentication using Spring Security. It provides a secure way to authenticate users and protect RESTful APIs. Users can register, log in, and receive a JWT token, which is then used for subsequent requests to access protected resources.

### Key Features

- User registration and login
- JWT generation and validation
- Secure REST API endpoints

## Tech Stack

- **Java**: The primary programming language for the backend application.
- **Spring Boot**: Framework for building production-ready applications quickly.
- **Spring Security**: Provides security features, including authentication and authorization.
- **JWT**: JSON Web Tokens used for securely transmitting information between parties.
- **Maven**: Dependency management and build tool.
- **PostgreSQL Database**: Used for storing user information and JWT tokens.
- **Docker**: Containerization platform for running the application in a consistent and isolated environment.
- **Postman**: Tool for testing APIs.

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/akhatarmourad/spring-security-auth.git
   ```

2. Configure PostgreSQL database:
    Edit the `application.properties` file and update the `spring.datasource.url` property to point to your PostgreSQL database, also adjust other properties as needed.

3. Run the project :
    to avoid problems, I recommend you to use Intellij IDEA to run the project directly from the IDE.