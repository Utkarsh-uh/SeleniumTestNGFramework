package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loginToApplication(String Username, String Password) {

		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	public void titleOfPage() {

		String title = driver.getTitle();
		System.out.println(title);

	}

}
