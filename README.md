
# Selenium Testing Framewok
Automation Testing Framework built with Java, Selenium WebDriver and TestNG for scalable and maintainable UI testing.

## Features
- Modular test structure using TestNG
- Reusable page object design pattern
- Easy test execution and reporting
- Automated Login form submission tests

## Getting Started
### Prerequisites
Ensure you have the following installed:
- Java 9+
- Maven
- TestNG Plugin
- Selenium WebDriver
### Installation
Clone the repository and install dependecies:
```bash
git clone https://github.com/AbdulMannan6643234/Selenium-testing-framework.git
cd Selenium-testing-framework
mvn clean install
```
### Running Tests
To run tests:
```bash
mvn test
```
## Project Structure

```text
Selenium-testing-framework/
├── src/main/java/pages/        # Page Objects and Utilities
└── src/test/java/              # TestNG test classes
├── pom.xml                     # Maven dependencies
```
### Future Improvements
- Add more comprehensive test coverage
- Integrate Reporting with Slack notifications
- Parametrize Tests for multiple environments
