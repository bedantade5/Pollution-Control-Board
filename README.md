# Pollution Control Board Monitoring System

## Overview
The Pollution Control Board Monitoring System is a comprehensive platform designed to monitor, analyze, and report environmental pollution data in real-time. It provides tools for government agencies, industries, and communities to track air and water quality, ensure compliance, and foster a cleaner, healthier environment.

## Key Features
- **Real-time Monitoring:** Continuous tracking of air quality, water parameters, and environmental conditions with instant alerts.
- **Data Analytics:** Advanced analytics and reporting tools to identify trends and assess environmental impact.
- **Community Reporting:** Citizen engagement platform for reporting environmental concerns and tracking resolutions.
- **Compliance Tracking:** Automated compliance monitoring and reporting for industries and organizations.

## Architecture
This project is organized as a multi-module Maven project:

- **commons-polutioncontrol:** Contains shared entity and DTO classes.
- **datastore-polutioncontrol:** Handles database operations using MyBatis and manages data persistence.
- **rest-apis-polutioncontrol:** Exposes RESTful APIs for authentication, data retrieval, and reporting.
- **web-app-polutioncontrol:** Provides a user-friendly web interface for dashboards, reports, and user management.

## Technologies Used
- **Java 8**
- **Spring Boot** (REST API, Web, Security)
- **MyBatis** (Database ORM)
- **MySQL** (Database)
- **JSP** (Frontend views)
- **Maven** (Build tool)
- **Log4j** (Logging)
- **OpenAPI/Swagger** (API documentation)
- **AWS S3** (File uploads)

## REST API Endpoints
- **Authentication:** `/user/auth/generateToken`, `/user/auth/save_user_auth`
- **User Login:** `/rs/v1/master/user_authentication`
- **Survey Details:** `/rs/v1/master/getDetails?dt=YYYY-MM-DD HH:mm:ss`
- **Environmental Report:** `/rs/v1/master/getEnvironmentalReport?startDateTime=...&endDateTime=...`

## Database
- **MySQL** is used for data storage.
- Database operations are managed via MyBatis mappers and stored procedures.

## Setup & Running
### Prerequisites
- Java 8+
- Maven
- MySQL (with a database named `pollution`)

### Build
From the `polution-control` directory, run:
```bash
mvn clean install
```

### Run REST API
From the `rest-apis-polutioncontrol` module:
```bash
mvn spring-boot:run
```
- The REST API will be available at `http://localhost:9998/`

### Run Web App
From the `web-app-polutioncontrol` module:
```bash
mvn spring-boot:run
```
- The web application will be available at `http://localhost:9995/`

## Configuration
- Edit `src/main/resources/application.properties` in each module to set database credentials, ports, and other settings.

## Screenshots
- **Dashboard:** Real-time environmental data and analytics.
- **Reports:** Downloadable and visual reports for compliance and trends.
- **Login:** Secure authentication for users and admins.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
This project is licensed for educational and demonstration purposes. 