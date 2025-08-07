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
1. Clone the repository:
   git clone https://github.com/your-username/seleniumframework.git
2. Navigate to the project directory:
   cd seleniumframework
3. Install dependencies using Maven:
   mvn clean install
4. Run the tests:
   mvn clean test
      
   



