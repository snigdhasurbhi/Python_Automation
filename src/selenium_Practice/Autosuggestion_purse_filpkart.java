package selenium_Practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestion_purse_filpkart {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement search =	   driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("mobile");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
 List<WebElement> suggestion = driver.findElements(By.xpath("//li[@class='Y5N33s']"));

int	number_of_count = suggestion.size();
	

 System.out.println("no" + number_of_count);  
 
	
 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
 
 driver.close();  
  /* WebElement hoverover = 	driver.findElement(By.xpath("(//img[@class ='_396cs4  _3exPp9'])[6]"));
Actions a = new Actions(driver);
a.moveToElement(hoverover).perform();  */ // 
	
		
		
		
	}

}
