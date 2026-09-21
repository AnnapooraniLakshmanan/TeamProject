package object_repository_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage 
{
	WebDriver driver;
	public ProductsPage()
	{
		PageFactory.initElements(driver, this);
	}
	

}
