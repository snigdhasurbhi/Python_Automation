package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_for_hoverOver {

	public static void main(String[] args) throws InterruptedException {
		//
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement hoverover = 	driver.findElement(By.xpath("(//img[@class ='_396cs4  _3exPp9'])[6]"));
		Actions a = new Actions(driver);  // action class is used for hover function for mouse event 
		a.moveToElement(hoverover).perform();	
		// //a[.='Bedsheets']
		Thread.sleep(2000);
		////a[.='Kitchen & Dining']
		WebElement kitchen = driver.findElement(By.xpath("//a[.='Kitchen & Dining']"));
		a.moveToElement(kitchen).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Lunchboxes, Bottles & Flasks']")).click();
		
	}

}
