package filpkart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Add_to_cart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); // for launching driver set property
		ChromeOptions options = new ChromeOptions(); // for resloving this error org.openqa.selenium.remote.http.ConnectionFailedException: Unable to establish websocket connection
		options.addArguments("--remote-allow-origins=*"); //for resloving issue
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement search = driver.findElement(By.name("q")); 
search.click();
search.sendKeys("phone");
search.sendKeys(Keys.ENTER);
Thread.sleep(3000);
 driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']/li[1]"));
 WebElement first_item = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[1]")); 
 first_item.click();
 Thread.sleep(3000);
 JavascriptExecutor J1 = (JavascriptExecutor) driver;
 J1.executeScript("window.scrollBy(0,1000)");
 WebElement add_cart = driver.findElement(By.name("Add 2 Items to Cart")); 
 add_cart.click();
	}

}
