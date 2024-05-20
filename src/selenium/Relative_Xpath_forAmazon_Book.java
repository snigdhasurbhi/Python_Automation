package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath_forAmazon_Book {

	public static void main(String[] args) {
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
	driver.close();
	}

	
}
