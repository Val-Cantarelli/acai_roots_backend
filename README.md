![Deploy](https://github.com/Val-Cantarelli/acai_roots_backend/actions/workflows/main.yml/badge.svg)

# Açaí Roots - Backend

This is the backend repository for the Açaí Roots project, providing the REST API built with Java (Spring Boot).

## Live Project
[🔗 Frontend Live Demo](https://val-cantarelli.github.io/acai_roots/)

## Overview
Açaí Roots aims to streamline service scheduling for small businesses, offering reliability and cost-effectiveness. The backend is hosted on Fly.io and uses MongoDB Atlas as the database.

## Related Repositories
- [Frontend (Vue.js)](https://github.com/val-cantarelli/acai_roots_frontend)
- [Static/Deploy](https://github.com/val-cantarelli/acai_roots)

## Technologies
- Java
- Spring Boot 3.1.2
- Apache Maven
- Docker
- Fly.io (cloud computing platform)
- MongoDB Atlas

## Getting Started

### Run with Maven
```bash
mvn spring-boot:run
```

### Run with Docker
```bash
docker build -t acai-roots-backend .
docker run -p 8080:8080 acai-roots-backend
```

### Deploy with Fly.io
- Create an account at [Fly.io](https://fly.io/)
- Configure the CLI
```bash
fly deploy
```

## Design
The backend uses a cloud-based CI/CD pipeline via GitHub Actions. Updates are automatically deployed to Fly.io. The 
application is containerized using Docker for isolation and scalability.

## Inspiration
This project began as an academic and learning experience, focused on building a practical counter service system for 
small businesses. The main goal was to explore modern development practices, including end-to-end architecture, 
cloud-based deployment, and CI/CD automation. The application was developed using Vue.js (frontend) and Spring Boot 
(backend) with MongoDB Atlas, featuring RESTful APIs and asynchronous communication via AJAX. The backend is deployed 
on Fly.io and the frontend on GitHub Pages, with a complete CI/CD pipeline powered by GitHub Actions and Docker. 
Note: A payment system was not implemented, as the project’s primary focus was on deployment, integration, and 
real-world cloud environments.
