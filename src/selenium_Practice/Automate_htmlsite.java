package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate_htmlsite {

	public static void main(String[] args) throws InterruptedException {
		//
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/snigd/Downloads/learningHTML.html");
		driver.manage().window().maximize();
		
	WebElement username =	driver.findElement(By.id("1"));  // user name
	username.sendKeys("snigdha");
		Thread.sleep(2000);
	username.sendKeys(Keys.TAB);
	WebElement hint = driver.findElement(By.xpath("((html/body/input)[2])")); 
	hint.sendKeys("hello");
		Thread.sleep(2000);
	hint.sendKeys(Keys.TAB);
	WebElement password = driver.findElement(By.xpath("((html/body/input)[3])"));
	password.sendKeys("1234");
		Thread.sleep(2000);
	password.sendKeys(Keys.TAB);
	WebElement  FirstName = driver.findElement(By.xpath("((html/body/form/input)[1])"));
	FirstName.sendKeys("hi_call_me");
		Thread.sleep(2000);
		password.sendKeys(Keys.TAB);
	WebElement Submit = driver.findElement(By.xpath("((html/body/form/input)[3])"));
	Submit.click();
	
//	WebElement errorpage = driver.findElement(By.id("buttons"));
//	 errorpage.sendKeys(Keys.ALT + "ARROW_LEFT");
	Thread.sleep(2000);
	
		driver.navigate().back();//
		
		WebElement checkbox = 	driver.findElement(By.xpath("//input[@id='123']"));  // select i have a boy 
		checkbox.click();
		checkbox.sendKeys(Keys.TAB);
		
			Thread.sleep(2000);
	
		WebElement checkbox2 = 	driver.findElement(By.xpath("(//input [@id='121'])[2]"));  // select i have a girl 
		checkbox2.click();
		checkbox2.sendKeys(Keys.TAB);

			Thread.sleep(2000);
	
		WebElement checkbox3 = 	driver.findElement(By.xpath("(//input [@id='321'])"));  // select i have a baby
		checkbox3.click();
		checkbox3.sendKeys(Keys.TAB);	
			Thread.sleep(2000);
			
			WebElement submit2 = driver.findElement(By.xpath("(/html/body/form/input)[7]"));
			submit2.click();
			Thread.sleep(2000);
			driver.navigate().back();
		WebElement radiobtn = 	driver.findElement(By.xpath("((html/body/input)[4] )")); 
	radiobtn.click();
	radiobtn.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	WebElement radiobtn2 = 	driver.findElement(By.xpath("((html/body/input)[5] )")); 
radiobtn2.click();
radiobtn2.sendKeys(Keys.TAB);	

Thread.sleep(2000);

WebElement banglore = 	driver.findElement(By.xpath("((html/body/input)[6] )")); 
banglore.click();
banglore.sendKeys(Keys.TAB);
	Thread.sleep(2000);
WebElement about_us = driver.findElement(By.linkText("Click to know about us"));
about_us.click();

	Thread.sleep(2000);

driver.navigate().back();

WebElement Religion = driver.findElement(By.xpath("//select[@id='Relegion']"));
	Thread.sleep(2000);
Select s = new Select(Religion);
// s.selectByValue("4");
s.selectByVisibleText("Christian");

	Thread.sleep(2000);

WebElement signup = driver.findElement(By.xpath("((html/body/input)[7] )")); 
signup.click();
signup.sendKeys(Keys.TAB);
		
			Thread.sleep(2000);
		driver.close();  
	}

}
