package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath_locator_Usernam {

	public static void main(String[] args) {
		// for username
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/snigd/Downloads/learningHTML.html");
	driver.findElement(By.xpath("((html/body/input)[1])")).sendKeys("snigdha");

	}

}
