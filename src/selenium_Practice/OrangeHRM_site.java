package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_site {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
WebElement platform = driver.findElement(By.linkText("Platform\r\n"));
Actions a = new Actions(driver);  // action class is used for hover function for mouse event 
a.moveToElement(platform).perform();
Thread.sleep(3000);
	
	WebElement contact_us =	driver.findElement(By.xpath("//a[.='Contact Sales']"));
	contact_us.click();
	WebElement full_name = driver.findElement(By.id("Form_submitForm_FullName"));
	full_name.sendKeys("snigdha Surbhi");
	Thread.sleep(2000);
	WebElement company_Name = driver.findElement(By.id("Form_submitForm_CompanyName"));
	company_Name.sendKeys("MRRC");
	Thread.sleep(2000);
	WebElement jobtitle = driver.findElement(By.id("Form_submitForm_JobTitle"));
	jobtitle.sendKeys("QA");
	Thread.sleep(2000);
	WebElement  no_of_employee = driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
	Select s= new Select( no_of_employee);
	s.selectByIndex(3);
	Thread.sleep(2000);
	WebElement All	=	driver.findElement(By.xpath("//div[@class='iti__selected-flag']"));
	All.click();
	WebElement country = driver.findElement(By.xpath("(//span[@class='iti__country-name'])[101]"));
	country.click();
	Thread.sleep(2000);
	WebElement number = driver.findElement(By.id("Form_submitForm_Contact"));
	number.sendKeys("9797989696");
	Thread.sleep(2000);
	WebElement emailid = driver.findElement(By.id("Form_submitForm_Email"));
	emailid.sendKeys("helloworldxyz17@gmail.com");
	WebElement comment = driver.findElement(By.id("Form_submitForm_Comment"));
	comment.sendKeys("hi hello i am here");
	Thread.sleep(2000);
	// WebElement recapache = driver.findElement(By.xpath("//span[@id='recaptcha-anchor']"));
//	recaptcha-anchor-label
	WebElement recapache = driver.findElement(By.id("recaptcha-anchor-label"));
	recapache.click();
	
	// WebElement recapache1 = driver.findElement(By.id("Nocaptcha-Form_submitForm_Captcha"));
	
	
	
	// //div[@class='iti__selected-flag']
	//  //ul[@id='iti-0__country-listbox']
	//div[@class='iti iti--allow-dropdown']
//	Select s1= new Select(All);
	// s.deselectByVisibleText("India");
//	s.selectByVisibleText("iti__dial-code");
	
	//s.selectByVisibleText("India +91");
//	s.selectByValue("((//span[@class='iti__country-name'])[101]");
//	s1.selectByValue("iti-0__item-in");
//	 s.selectByIndex(100);
	// (//span[@class='iti__country-name'])[101]
	 // //li[@id='iti-0__item-af']
// //div[@class='iti iti--allow-dropdown']	
	
	
	
	
	
	
	
	
	
	
	
	
	Thread.sleep(3000);
		driver.close();

	}

}
