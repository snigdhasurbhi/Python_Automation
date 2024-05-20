package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsXpath_Firstname {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/snigd/Downloads/learningHTML.html");
	//
	WebElement  FirstName = driver.findElement(By.xpath("((html/body/form/input)[1])")); //absolute
	
		FirstName.sendKeys("f");
		FirstName.sendKeys("g");
		driver.manage().window().maximize(); // for maximize screen
		

	}

}
