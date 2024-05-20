package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	//	JavascriptExecutor J1 = (JavascriptExecutor) driver;
		
		for(int i=0; i<100; i--) {
			Thread.sleep(3000);
		   JavascriptExecutor J1 = (JavascriptExecutor) driver;
		   J1.executeScript("window.scrollBy(0,1000)");
		}
		Thread.sleep(3000);
		driver.close();
		
	}

}
