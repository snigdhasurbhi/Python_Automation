package selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_lion_from_google_image {

	public static void main(String[] args) {
		//
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
        driver.manage().window().maximize();
   WebElement search= driver.findElement(By.xpath("(//input)[@class=\"gLFyf gsfi\"]"));
   search.sendKeys("lions");
   
// List<WebElement> auto = driver.findElements(By.xpath("//li[@class='sbct sbre']"));
   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
   List<WebElement> auto = driver.findElements(By.xpath("//div[@class='ClJ9Yb']"));
 int count = auto.size();
 System.out.println(" number  " + count);
 
   
	}

}
