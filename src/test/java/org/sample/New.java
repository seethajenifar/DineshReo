package org.sample;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sample1.NewBaseclass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base1.baseclasslogin;
import samlegit2.NewLogin;
public class New extends db{
public static void main(String[] args) {
}
	@BeforeClass
	public void beforeclass() {
	edgeLaunch();
	 urlLaunch("http://www.adactinhotelapp.com/");
	impWait(20);
	}
	 @BeforeMethod
	public void beforemethod() {
	Date d = new Date();
	System.out.println("start time"+d);
	}
	@AfterMethod
	public void aftermethod() {
	Date d = new Date();
	System.out.println("end time"+d);
	}
	@Test
	public void test() throws IOException {
	NewLogin l = new NewLogin();
	sendkeys(l.gettxtusername(),"seethajenifar");
	sendkeys(l.gettxtpassword(),"Chennai23");
	click(l.getbtnlogin());
	}
	
	@Test
	public void test2()throws IOException {
		NewLogin l = new NewLogin();
	click(l.getlocation());
	SelectByIndex(l.getlocation(),1);
	click(l.gethotels());
	SelectByIndex(l.gethotels(),1);
	click(l.getroomtype());
	SelectByIndex(l.getroomtype(),1);
	click(l.getNoofrooms());
	SelectByIndex(l.getNoofrooms(),1);
	sendkeys(l.getcheckindate(),"08/08/2023");
	sendkeys(l.getcheckoutdate(),"09/08/2023");
	click(l.getadultsperroom());
	SelectByIndex(l.getadultsperroom(),1);
	click(l.getchildrensperroom());
	SelectByIndex(l.getchildrensperroom(),1);
	click(l.getsearch());
	click(l.getradioclick());
	click(l.getbtnlogin());
	click(l.getbtncontinue());
	sendkeys(l.getfirstname(),"seetha");
	sendkeys(l.getlastname(),"h");
	sendkeys(l.getbillingaddress(),"chrompet");
	sendkeys(l.getcardno(),"1234567898765432");
	click(l.getcrtype());
	SelectByIndex(l.getcrtype(),3);
	click(l.expiry());
	SelectByIndex(l.expiry(),8);
	click(l.expiry());
	click(l.expiryyear());
	SelectByIndex(l.expiryyear(),12);
	click(l.expiryyear());
	sendkeys(l.cvv(),"123");
	click(l.clickbooknow());
	System.out.println(getAtt(l.getOrdernumber()));
	
	click(l.BookedItinerary());
	click(l.radiobtn());
	click(l.Orderid());
	click(l.cancelbox());
	
	//alert
Alert a = driver.switchTo().alert();
a.accept();
	}
	private void SelectByIndex(WebElement getlocation, int i) {
		
		
	}
	
		
	}
	
	
	
//	WebElement txtusename = h.get.txtusername();
//	//sendkeys(txtusename,"seetha");
//	WebElement txtpassword = h.get.txtpassword();
//	sendkeys(txtpassword,"seetha");
//	WebElement btnlogin = h.getbtnlogin();
//	click(btnlogin);
//	WebElement location = h.getlocation();
//	sendkeys(location,"sydney");
//	WebElement hotels = h.gethotels();
//	sendkeys(hotels,"hotel creek");
//	WebElement roomtype = h.getroomtype();
//	sendkeys(roomtype,"standard");
//	WebElement noofrooms = h.getnoofrooms();
//	sendkeys(noofrooms,"1-one");
	//
//	WebElement year = driver.findElement(By.id("datepick_in"));
//	Select s1 = new Select(year);
//	s1.selectByValue("2023");
//	WebElement month = driver.findElement(By.id("datepick_in"));
//	Select s2 = new Select(month);
//	s2.selectByValue("august");
//	WebElement day = driver.findElement(By.id("datepick_in"));
//	Select s3 = new Select(day);
//	s3.selectByValue("8");
	//
//	WebElement year = driver.findElement(By.id("datepick_in"));
//	Select s1 = new Select(year);
//	s1.selectByValue("2023");
//	WebElement month = driver.findElement(By.id("datepick_in"));
//	Select s2 = new Select(month);
//	s2.selectByValue("august");
//	WebElement day = driver.findElement(By.id("datepick_in"));
//	Select s3 = new Select(day);
//	s3.selectByValue("9");
	//
//	WebElement checkindate = h.getcheckindate();
//	sendkeys(checkindate,"8/8/2023");
//	WebElement checkoutdate = h.getcheckoutdate();
//	sendkeys(checkoutdate,"9/8/2023");
//	WebElement adultsperroom = h.getadultsperroom();
//	sendkeys(adultsperroom,"1-one");
//	WebElement childrensperroom = h.getchildrensperroom();
//	sendkeys(childrensperroom,"0-no");
//	WebElement search = h.getsearch();
//	click(search);
//	WebElement radiobtn = h.getradiobtn();
//	click(radiobtn);
//	WebElement btncontinue = h.getbtncontinue();
//	click(btncontinue);
//	WebElement firstname = h.getfirstname();
//	sendkeys(firstname,"seetha");
//	WebElement lastname = h.getlastname();
//	sendkeys(lastname,"h");
//	WebElement billingaddress = h.getbillingaddress();
//	sendkeys(billingaddress,"vstreet");
//	WebElement cardno = h.getcardno();
//	sendkeys(cardno,"1234567898765432");
//	WebElement crtype = h.getcrtype();
//	sendkeys(crtype,"mastercard");
//	WebElement expiry = h.getexpiry();
//	sendkeys(expiry,"aug2023");
//	WebElement cvv = h.getcvv();
//	sendkeys(cvv,"123");
//	WebElement booknow = h.getbooknow();
//	click(booknow);
//	//
//	String a = ("ordernumber-ST9GOHR1J2");
//	System.out.println(a);
	//quit();
