package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_filpkart  extends Username_pswd_filpkart {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Login_filpkart tocall = new Login_filpkart();
		
	WebElement  username =	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	tocall.username(username);
	
	WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	tocall.password(password); 

		
	WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	login.click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// 
		System.out.println(e);	
	}

	 driver.close();
	
	
	}
	
	

}
