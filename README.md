# Selenium Web Automation Project
This project demonstrates web automation testing using Selenium WebDriver, TestNG, and Page Object Model.
## Tech Stack
^ Selenium WebDriver
^ TestNG
^ Java
^ POM
# Project Structure
<details>
<summary>📁 Project Structure</summary>

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

</details>

