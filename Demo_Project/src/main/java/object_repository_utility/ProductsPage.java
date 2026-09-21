package object_repository_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage 
{
	WebDriver driver;
	public ProductsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Products")
	private WebElement productlink;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement productbtn;
	
	
	

}
