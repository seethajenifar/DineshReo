package samlegit2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample1.NewBaseclass;
public class NewLogin extends NewBaseclass{
public void test() {
NewLogin l = new NewLogin();
PageFactory.initElements(driver, this);
}
@FindBy(id ="email")
private WebElement txtusername;

@FindBy(id ="pass")
private WebElement txtpassword;

@FindBy(name ="login")
private WebElement btnlogin;

public WebElement gettxtusername() {
return txtusername;
}
public WebElement gettxtpassword() {
return txtpassword;
}
public WebElement getbtnlogin() {
return btnlogin;
	}
	@FindBy(id ="location")
	private WebElement location;
	public WebElement getlocation() {
	return location;
	}
	@FindBy(id ="hotels")
	private WebElement Hotels;
	public WebElement gethotels() {
	return Hotels;
	}
	@FindBy(id ="room_type")
	private WebElement roomtype;
	public WebElement getroomtype() {
	return roomtype;
	}
	@FindBy(id ="room_nos")
	private WebElement Noofrooms;
	public WebElement getNoofrooms() {
	return Noofrooms;
	}
	@FindBy(id ="datepick_in")
	private WebElement checkindate;
	public WebElement getcheckindate() {
	return checkindate;
	}
	@FindBy(id ="datepick_out")
	private WebElement checkoutdate;
	public WebElement getcheckoutdate() {
	return checkoutdate;
	}
	@FindBy(id ="adult_room")
	private WebElement adultsperroom;
	public WebElement getadultsperroom() {
	return adultsperroom;
	}
	@FindBy(id ="child_room")
	private WebElement childrensperroom;
	public WebElement getchildrensperroom() {
	return childrensperroom;
	}
	@FindBy(id ="Submit")
	private WebElement search;
	public WebElement getsearch() {
	return search;
	}
	@FindBy(id ="radiobutton_0")
	private WebElement radioclick;
	public WebElement getradioclick() {
	return radioclick;
	}
	@FindBy(id ="continue")
	private WebElement btncontinue;
	public WebElement getbtncontinue() {
	return btncontinue;
	}
	@FindBy(id ="first_name")
	private WebElement firstname;
	public WebElement getfirstname() {
	return firstname;
	}
	@FindBy(id ="last_name")
	private WebElement lastname;
	public WebElement getlastname() {
	return lastname;
	}
	@FindBy(id ="address")
	private WebElement billingaddress;
	public WebElement getbillingaddress() {
	return billingaddress;
	}
	@FindBy(id ="cc_num")
	private WebElement cardno;
	public WebElement getcardno() {
	return cardno;
	}
	@FindBy(id ="cc_type")
	private WebElement crtype;
	public WebElement getcrtype() {
	return crtype;
	}
	@FindBy(id ="cc_exp_month")
	private WebElement expiry;
	public WebElement expiry() {
	return expiry;
	}
	@FindBy(id ="cc_exp_year")
	private WebElement expiryyear;
	public WebElement expiryyear() {
	return expiryyear;
	}
	@FindBy(id ="cc_cvv")
	private WebElement cvv;
	public WebElement cvv() {
	return cvv;
	}
	@FindBy(id ="book_now")
	private WebElement clickbooknow; 
	public WebElement clickbooknow() {
	return clickbooknow;
	}
	@FindBy(id ="order_no")
	private WebElement ordernumber;

	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return Hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	public WebElement getAdultsperroom() {
		return adultsperroom;
	}
	public WebElement getChildrensperroom() {
		return childrensperroom;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getRadioclick() {
		return radioclick;
	}
	public WebElement getBtncontinue() {
		return btncontinue;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getBillingaddress() {
		return billingaddress;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCrtype() {
		return crtype;
	}
	public WebElement getExpiry() {
		return expiry;
	}
	public WebElement getExpiryyear() {
		return expiryyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getClickbooknow() {
		return clickbooknow;
	}
	public WebElement getOrdernumber() {
		return ordernumber;
	}
//	@FindBy (xpath=("//a[contains(@href='Booked Itinerary')]");
//	private WebElement clickBookedItinerary;
//	public WebElement BookedItinerary() {
//	return clickBookedItinerary;
//	}
	@FindBy (className ="ids[]")
	private WebElement orderid;
	public WebElement Orderid() {
	return orderid;
	}
	@FindBy (className ="cancelall")
	private WebElement cancelbox;
	public WebElement cancelbox() {
	return cancelbox;
	}
	public WebElement clkok() {
	return clkok();
	}}

	//driver.quit();
