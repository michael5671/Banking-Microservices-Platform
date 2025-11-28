# 🏦 Banking Microservices Platform

A cloud-native **banking microservices system** built using **Spring Boot, Spring Cloud, Kafka, Docker & Kubernetes**.  
The system is designed following **clean separation of services**, leveraging **API Gateway, Eureka Service Discovery, and Event-Driven Communication**.

⚠ **Currently, only the `account-service` has been implementing.**  
`card-service` and `loan-service` will be developed in upcoming phases.

## 🧩 Services Overview
| Service | Status          | Description |
|---------|-----------------|-------------|
| `accounts` | 🟢 Implementing | Manage banking account information |
| `cards` | 🔜 In Progress  | Credit/Debit card management |
| `loans` | 🔜 Planned      | Loan application & processing |

## 🧱 Technology Stack
| Category | Tools                            |
|----------|----------------------------------|
| Language | Java 17                          |
| Framework | Spring Boot                      |
| Database | H2                               |
| API Documentation | OpenAPI (Swagger)                |


## 🚀 Getting Started

### 1️⃣ Clone the repository
```bash
git clone https://github.com/<your-username>/banking-microservices-platform.git
cd banking-microservices-platform
```
### 2️⃣ Run account-service locally
```bash
cd accounts 
mvn clean install
mvn spring-boot:run
```
### 📁 Project Structure
banking-microservices-platform/  
├── accounts/      
├── cards/         
├── loans/ 
