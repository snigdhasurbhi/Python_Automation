package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Launch_amazon {
	WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
@Test
public void add()
{
	 WebElement Booksoption =  driver.findElement(By.linkText("Books"));
	    Booksoption.click();
	    WebElement FirstBookSelect = driver.findElement(By.xpath("(//img)[@ alt='GROW YOUR BABY, NOT YOUR WEIGHT: AN EXTRAORDINARY MEMOIR OF PREGNANCY, BIRTHING AND EVERYTHING BETWEEN']"));
		FirstBookSelect.click();
	    WebElement AddtoCart = driver.findElement(By.xpath("//input[@ id= \"add-to-cart-button\"]"));	
		AddtoCart.click();
}
	@AfterMethod
	public void close() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
}
		driver.quit();
	}

}
