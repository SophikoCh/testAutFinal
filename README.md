# Web Testing Framework

## Overview
This is a simple web testing framework using Java, Selenium, TestNG, and RestAssured.

## Setup
1. Install Java and Maven.
2. Update `config.properties` with your values for `baseUrl` and `chromeDriverPath`.
3. Run the tests using the following command:
   ```
mvn test
   ```

## Structure
- `utils`: Utility classes (e.g., ConfigReader).
- `pages`: Page Object Model classes.
- `tests`: TestNG test classes for web tests.
- `api`: RestAssured API tests.

## Features
- Web tests using Selenium.
- API tests using RestAssured.
- Configurable properties.
- TestNG reporting.
