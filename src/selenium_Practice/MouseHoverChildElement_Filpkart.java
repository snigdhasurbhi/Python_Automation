package selenium_Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverChildElement_Filpkart extends Username_pswd_filpkart {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
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
		Thread.sleep(3000);
    //    WebElement toys = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[9]"));
    //(//img[@class='_396cs4  _3exPp9'])[9]    
		WebElement toys = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[9]"));
		Thread.sleep(2000);	
		Actions A1 = new Actions(driver);	
		A1.moveToElement(toys).perform();
		Thread.sleep(2000);
	 // //a[.='Food & Drinks']
		WebElement foods = driver.findElement(By.xpath("//a[.='Food & Drinks']"));
		A1.moveToElement(foods).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.='Nuts & Dry Fruits'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='CXW8mj _21_khk'])[3]")).click();
		Thread.sleep(2000);
		String handle =	driver.getWindowHandle();
		System.out.println("id of the browser" + handle);
	Set<String>	id =  driver.getWindowHandles();  
	System.out.println(id);
	
	
	Thread.sleep(2000);
	driver.quit();
	}

}
