# Selenium Java Test Automation Framework

Test automation framework built with **Java, Selenium WebDriver, Cucumber and JUnit** using modern QA engineering best practices.
The project demonstrates end-to-end test automation for the SauceDemo e-commerce website.

## Tech Stack

- Java 17
- Selenium WebDriver
- Cucumber BDD
- JUnit
- Maven
- Page Object Model (POM)
- WebDriver Manager

## Project Structure

src
├── main
│   └── java
│        ├── pages
│        ├── driver
│        └── utils
│
└── test
└── java
├── runners
├── stepdefinitions
└── hooks

resources
├── features
└── config

## Test Scenarios Covered

### Login
- Valid login
- Invalid login
- Locked user login
- Problem user login

### Shopping Cart
- Add product to cart
- Remove product
- Validate cart price

### Checkout Flow
- Complete purchase flow
- Validate order confirmation

## How to Run Tests

Clone repository
