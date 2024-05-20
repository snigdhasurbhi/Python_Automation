package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Open_cart_Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Booksoption =  driver.findElement(By.linkText("Books"));
	    Booksoption.click();
	    WebElement FirstBookSelect = driver.findElement(By.xpath("(//img)[@ alt='GROW YOUR BABY, NOT YOUR WEIGHT: AN EXTRAORDINARY MEMOIR OF PREGNANCY, BIRTHING AND EVERYTHING BETWEEN']"));
		FirstBookSelect.click();
	    WebElement AddtoCart = driver.findElement(By.xpath("//input[@ id= \"add-to-cart-button\"]"));	
		AddtoCart.click();
		Thread.sleep(2000);
	//	WebElement open_cart	= driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
		// nav-cart-count
		WebElement open_cart	= driver.findElement(By.id("nav-cart-count"));
		open_cart.click();
		WebElement quantity = driver.findElement(By.xpath("//span[@class='a-dropdown-label']"));
		quantity.click();
		Thread.sleep(2000);
		WebElement no_quantity = driver.findElement(By.id("quantity_4"));
		no_quantity.click();
		Thread.sleep(2000);
	WebElement see_more = driver.findElement(By.xpath("(//input[@value='See more like this'])[1]"));
		// //input[@name='submit.compare.C61fd5103-b2e4-4bff-9f53-ecfdd13b4a81']
	// a-color-link
	see_more.click();
	Thread.sleep(2000);
	
	WebElement delete = driver.findElement(By.xpath("//input[@class='a-color-link']"));   // deleteing the cart
		delete.click();
		// id= quantity_4
	/*	Select s = new Select(quantity);
		s.selectByIndex(6);  */
		Thread.sleep(2000);
	driver.close();

	}

}
