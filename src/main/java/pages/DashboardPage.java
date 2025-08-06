package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	@FindBy(xpath = "//a[normalize-space()='Add Customer']")
	private WebElement addCustomerbutton;

	@FindBy(xpath = "//input[@id='name']")
	private WebElement addName;
	
	@FindBy(xpath = "//input[@id='buyingrate']")
	private WebElement addNumber;


	@FindBy(xpath = "//textarea[@placeholder='ENTER YOUR ADDRESS']")
	private WebElement addAddress;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement finalAddbutton;

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void addCustomer()
	{
		addCustomerbutton.click();
	}
	
	public void addname() 
	{
		addName.sendKeys("Utkarsh Haste");
		
	}
	public void addnumber()
	{
		addNumber.sendKeys("9876543210");
	}
	public void addaddress()
	{
		addAddress.sendKeys("India");
	}
	
	public void addButton()
	{
		finalAddbutton.click();
	}

	
	
	

}
