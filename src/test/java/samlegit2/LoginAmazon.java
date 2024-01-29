package samlegit2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base1.baseclasslogin;
public class LoginAmazon extends baseclasslogin{
public LoginAmazon() {
PageFactory.initElements(driver, this);
}
	@FindBy(id ="nav-hamburger-menu")
    private WebElement allsearchtxt;
	public WebElement getallsearchtxt() {
	  return allsearchtxt;
    }
	@FindBy (xpath="//div[text()='Electronics']")
	private WebElement Electronis;
	
	public WebElement getElectronis() {
		return Electronis;
	}
	@FindBy (xpath="(//a[text()='Cell Phones & Accessories'])[2]")

		private WebElement Cellphone;
	    
	public WebElement getCellphone() {
		return Cellphone;
	}
	@FindBy (xpath="(//i[@class='a-icon a-icon-checkbox'])[2]")
	private WebElement brand;
	
	public WebElement getkotak() {
		return brand;
	}
    @FindBy (xpath="(//span[@class='a-size-base a-color-base'])[13]")
	private WebElement price;
	public WebElement getPrice() {
		return price;
	}
	@FindBy (xpath="(//img[@class='s-image'])[3]")
	private WebElement product;
	public WebElement getProduct() {
		return product;
	}
	@FindBy (xpath="(//input[@type='submit'])[2]")
	private WebElement submit ;
	public WebElement getsubmit() {
		return submit;
	}
	@FindBy(id="nav-cart-count-container")
	private WebElement cart;
	public WebElement getcart() {
		return cart;
	}
	
	
}