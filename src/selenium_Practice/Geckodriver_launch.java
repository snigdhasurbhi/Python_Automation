package selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Geckodriver_launch {

	public static void main(String[] args) {
		//
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\geckodriver-v0.30.0-win64_unzip\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();  // webdriver is the interface and firefox is class we are creating an object for firefox class
		driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	
	System.out.println(e);
	
}
 driver.close();

	}

}
