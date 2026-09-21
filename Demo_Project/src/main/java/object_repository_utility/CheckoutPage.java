package object_repository_utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage 
{
	WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="CheckoutPage")
    private WebElement CheckoutPagelink;
    @FindBy()
    WebElement link;
	


		
	
	System.out.print("product name");
	

}
