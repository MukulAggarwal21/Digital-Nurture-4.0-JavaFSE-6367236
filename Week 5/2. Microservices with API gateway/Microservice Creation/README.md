# Microservices Project - Account and Loan Services

This project demonstrates two independent Spring Boot microservices:

- **Account Service** (port: 8080): Handles user bank account details.
- **Loan Service** (port: 8081): Handles user loan account details.

## Microservices Overview

### Account Microservice

- **Endpoint:** `/accounts/{number}`
- **Method:** GET
- **Sample Response:**
```json
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}
```

### Loan Microservice

- **Endpoint:** `/loans/{number}`
- **Method:** GET
- **Sample Response:**
```json
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```

## Author

**Mukul Aggarwal**
