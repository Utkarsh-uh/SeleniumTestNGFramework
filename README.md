# Selenium Web Automation Project
This project demonstrates web automation testing using Selenium WebDriver, TestNG, and Page Object Model.
##  Tech Stack

- Java  
- Selenium WebDriver  
- TestNG  
- POM
- Maven

## Project Structure

```
seleniumframework/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── base/
│   │       │   └── BaseTest.java
│   │       └── pages/
│   │           ├── Baseclass.java
│   │           ├── LoginPage.java
│   │           └── DashboardPage.java
│   └── test/
│       └── java/
│           ├── listeners/
│           │   ├── ExtentReport.java
│           │   └── ListenersTestNG.java
│           ├── testcases/
│           │   ├── BaseTest.java
│           │   ├── LoginTest.java
│           │   └── DashboardTest.java
│           └── utility/
│               ├── ExcelSheet.java
│               ├── ReadDataFromPropFile.java
│               └── Screenshot.java
├── ExcelSheet/
│   └── Book1.xlsx
├── reports/               # 🔹 Test report files (e.g., ExtentReport.html)
├── config/
│   └── config.properties
├── drivers/
│   └── chromedriver.exe
├── screenshots/
├── logs/
├── README.md
├── pom.xml
├── testng.xml
└── .gitignore
```
## How To Run Tests
1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/seleniumframework.git
   ```
3. **Navigate to the project directory**:
   ```bash
   cd seleniumframework
   ```
5. **Install dependencies using Maven**:
   ```bash
   mvn clean install
   ```
7. **Run the tests**:
   ```bash
   mvn clean test
   ```
## Features
- Page Object Model (POM)
- Custom Listeners with Retry logic
- Excel-driven test data
- Screenshots on failure
- HTML report via ExtentReports

## Reports AND Logs
- reports/ExtentReport.html – Execution report
- screenshots/ – Screenshots of failed tests
- logs/ – Log files (optional)

## Author

**Utkarsh Haste**  
 QA Engineer | GitHub: [@Utkarsh-uh](https://github.com/Utkarsh-uh)


## Feedback/Contribute
Feel free to fork this repo, raise issues, or contribute improvements!

   
      
   



