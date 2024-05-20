package selenium_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebok_login {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
	/*	String handle =	driver.getWindowHandle();
		System.out.println("id of the browser" + handle);
		Set<String>	id =  driver.getWindowHandles();  
		System.out.println(id);
	Iterator<String> I = id.iterator();
	String Parent = I.next();
	String Child = I.next();
	System.out.println(Parent);
	System.out.println(Child);
	Thread.sleep(3000);
	driver.switchTo().window(Child);
	Thread.sleep(3000);  */
		WebElement Firstname = driver.findElement(By.id("u_3_b_R2"));
		//  "//input[@id='u_3_b_R2']"
	//	WebElement Firstname = driver.findElement(By.name("firstname"));
		// Firstname.click();
			Thread.sleep(3000);
		Firstname.sendKeys("snigdha");

	}

}
