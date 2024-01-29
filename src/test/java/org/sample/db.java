package org.sample;
import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.support.ui.Select;
	public class db {
	public static WebDriver driver;
		public static  void chromelunch(String url) {
			driver=new ChromeDriver();
	      		}
	public static void edgeLaunch() {
		//.edgedriver().setup();
		 driver=new EdgeDriver();
				}
		public static void urlLaunch(String url) {
		driver.get(url);
				}
		public static void impWait(  int sec) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			}
		
		public static void sendkeys(WebElement a,String data) {
			a.sendKeys(data);
					}
				public  static void sendkeys1(WebElement b,String data) {
			b.sendKeys(data);
					}
		public static void click(WebElement e) {
			e.click();
		}
			public static String getTitle() {
			String title = driver.getTitle();
			return title;
					}
		public static void selectInd(int index,WebElement c) {
			Select s=new Select(c);
			s.selectByIndex(index);
		}
			public static  void windowhandle() {
			Set<String> allid = driver.getWindowHandles();
			System.out.println(allid);
			List<String>li=new ArrayList<String>();
			li.addAll(allid);
			driver.switchTo().window(li.get(1));
		}
		public static String getcurrenturl() {
			String currenturl= driver.getCurrentUrl();
			return currenturl;
		}			
			public static  String getAtt( WebElement e) {
				String att= e.getAttribute("value");
			    return att;
			}
			}

