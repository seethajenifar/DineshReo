package org.sample;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.sample1.NewBaseclass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base1.baseclasslogin;
import samlegit2.LoginAmazon;
public class Amazontask extends baseclasslogin{
	@BeforeClass
	public void beforeclass() {
	edgeLaunch();
		urlLaunch("https://www.amazon.com/");
		impWait(10);
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
	LoginAmazon l = new LoginAmazon();   
		click(l.getallsearchtxt());
		click(l.getElectronis());
		click(l.getCellphone());
		click(l.getkotak());
		click(l.getPrice());
		click(l.getProduct());
		click(l.getsubmit());
		click(l.getcart());
		TakesScreenshot tk = (TakesScreenshot)driver;
		File srcFile = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(srcFile);
		File destFile = new File("C:\\Users\\GOWRI\\eclipse-workspace\\Maven_testng_git\\image.png");
		FileUtils.copyDirectory(srcFile, destFile);
		}}
			
		//WebElement allbtn = driver.findElement(By.id("nav-hamburger-menu")); 
		//allbtn.click();
		//WebElement mobile = driver.findElement(By.xpath("//div[text='Mobiles, Computers']"));
		//mobile.click();
		//allmobile text ='All Mobile Phones']"));
		//WebElement electronic = driver.findElement(By.id("")); 
		//electronic.click();
		//WebElement mobile = driver.findElement(By.id("")); 
		//mobile.click();
//		WebElement txtUsername = driver.findElement(By.id("twotabsearchtextbox"));
//		txtUsername.sendKeys("iphone");
//		WebElement btnsearch = driver.findElement(By.id("nav-search-submit-button")); 
//		btnsearch.click();
//		WebElement image = driver.findElement(By.className("s-image"));
//		image.click();
//		System.out.println("done");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	WebElement cart = driver.findElement(By.id("add-to-cart-button"));
//	cart.click();
	
