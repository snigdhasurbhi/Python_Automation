package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_for_filpkart {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement search =	driver.findElement(By.xpath("//input[@class='_3704LK']")); //.sendKeys("puma");
	search.sendKeys("puma");
	search.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		List <WebElement> puma =	driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']/li"));
		
		int	number_of_count = puma.size();
		 System.out.println("no" + number_of_count);  

	}

}
