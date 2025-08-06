package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import pages.DashboardPage;
import pages.LoginPage;

public class BaseTest {

	public static WebDriver driver;
	LoginPage lp;
	public DashboardPage dp;

	@BeforeSuite
	public void inBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stock.scriptinglogic.org/index.php?msg=You%20have%20been%20logged%20out!&type=information");

	}

	@BeforeClass
	public void objectCreate() throws IOException {
		lp = new LoginPage(driver);
		dp = new DashboardPage(driver);

	}

//	@AfterSuite
//	public void tearDown() {

	//	driver.quit();
	}

