# 🌱 Pollution Control Board Monitoring System

### 👨‍💻 Built during my internship at [Vyoma Innovus Global Pvt Ltd](https://www.vyomainnovusglobal.com)

---

## 🌍 Overview

The **Pollution Control Board Monitoring System** is a real-time platform built to help monitor, analyze, and report environmental data — like air and water pollution — in an accessible and efficient way.

It’s designed to help:
- 🏛️ **Government agencies** regulate pollution  
- 🏭 **Industries** ensure compliance  
- 👨‍👩‍👧‍👦 **Citizens** stay informed and engaged  

---

## 🚀 Key Features

- 📡 **Real-time Monitoring** – Track air and water quality with instant alerts  
- 📊 **Data Analytics** – See trends, generate reports, make smarter decisions  
- 📢 **Community Reporting** – Let citizens raise environmental concerns  
- ✅ **Compliance Tracking** – Stay ahead of environmental regulations  

---

## 🧱 Project Architecture

This is a **multi-module Maven** project split into logical parts:

| Module | Description |
|--------|-------------|
| `commons-polutioncontrol` | Shared entity and DTO classes |
| `datastore-polutioncontrol` | Handles DB ops with **MyBatis** |
| `rest-apis-polutioncontrol` | Exposes REST APIs for data and login |
| `web-app-polutioncontrol` | JSP-based frontend with dashboards and user views |

---

## 💻 My Stack

This is the tech I used to build the system:

- 🔧 **Java 8**
- ⚙️ **Spring Boot** (Web, Security, REST)
- 🧩 **MyBatis** (ORM)
- 🗃️ **MySQL** (Database)
- 🎨 **JSP** (Views)
- 📦 **Maven** (Build tool)
- 📄 **Swagger / OpenAPI** (API Docs)
- 🪵 **Log4j** (Logging)
- ☁️ **AWS S3** (File uploads)

---

## 🔌 API Endpoints

| Feature | Endpoint |
|--------|----------|
| Generate Token | `/user/auth/generateToken` |
| Save Auth | `/user/auth/save_user_auth` |
| Login | `/rs/v1/master/user_authentication` |
| Survey Data | `/rs/v1/master/getDetails?dt=YYYY-MM-DD HH:mm:ss` |
| Reports | `/rs/v1/master/getEnvironmentalReport?startDateTime=...&endDateTime=...` |

---

## 🛠️ Setup & Running (Easy Steps)

### Prerequisites

- ✅ Java 8 or later  
- ✅ Maven  
- ✅ MySQL (create a database named `pollution`)  
- ✅ Eclipse or IntelliJ (recommended)

---

### 1. Clone the Repo

```bash
git clone https://github.com/your-username/pollution-control.git
cd pollution-control
```

### 2. Build the Project

```bash
mvn clean install
```

### 3. Run the REST API Module

```bash
cd rest-apis-polutioncontrol
mvn spring-boot:run
```
- The REST API will be available at http://localhost:9998/

### 4. Run the Web App Module

```bash
cd web-app-polutioncontrol
mvn spring-boot:run
```
- The web application will be available at http://localhost:9995/

## ⚙️ Configuration

Before running the modules, update the `application.properties` file located in each module’s `src/main/resources/` directory with the correct database credentials and server port.

### Example:

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/pollution
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword

# REST API Server Port
server.port=9998

# OR Web App Server Port
server.port=9995
```

## 💡 Inspiration

This project was developed during my internship at **Vyoma Innovus** with the vision of building a real-time pollution monitoring system that empowers authorities, industries, and communities to take informed actions against environmental hazards.

Pollution is a critical issue that affects health, ecosystems, and quality of life. I wanted to contribute to a solution that promotes transparency, accountability, and timely decision-making using modern technology.

This project allowed me to combine my technical learning with a meaningful cause, and helped me gain hands-on experience in building scalable, full-stack applications with real-world impact.

## 🌟 Future Ideas

Here are some enhancements and features that could be added to improve and expand the system:

- **Mobile App Integration**  
  Build Android/iOS apps to provide users (citizens, field agents, etc.) with real-time alerts, environmental reports, and location-based pollution data on the go.

- **Push Notifications & Email Alerts**  
  Implement real-time alert systems that notify users and authorities when pollution levels exceed safe limits in their area.

- **Pollution Heatmaps**  
  Visualize pollution data (air quality, water quality, etc.) on interactive maps using geolocation, enabling better regional analysis.

- **Downloadable Reports (PDF/CSV)**  
  Allow users and regulators to download summary and detailed reports for compliance, audits, and public communication.

- **AI-Powered Predictive Analytics**  
  Use machine learning to detect anomalies or predict pollution spikes based on historical data and weather conditions.

- **IoT Sensor Network Integration**  
  Connect physical pollution sensors (e.g., air and water quality sensors) directly with the backend to enable fully automated, real-time data ingestion and monitoring.

- **Multi-language Support**  
  Make the platform more inclusive by offering support for regional languages for both the web app and mobile apps.

- **Role-Based Dashboards**  
  Tailor the user experience based on roles (e.g., Admin, Industry Official, Environmental Officer, Citizen) to ensure relevant data visibility and access control.

---

### 💙 Made with care and curiosity by **Bedanta De**
