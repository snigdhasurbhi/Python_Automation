package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_Link {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.amazon.in/");
		driver.get("https://www.google.com/");
		driver.findElement(By.partialLinkText("Ima")).click();
		// driver.close();

	}

}
