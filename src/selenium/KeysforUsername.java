package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysforUsername {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/snigd/Downloads/learningHTML.html");
		
// 	driver.findElement(By.xpath("((html/body/input)[1])")).sendKeys("snigdha");
WebElement username = 		driver.findElement(By.id("1"));
username.sendKeys("Snigdha surbhii");

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// 
	System.out.println(e);
}

username.sendKeys(Keys.BACK_SPACE);
username.sendKeys(Keys.CONTROL +"A");
username.sendKeys(Keys.CONTROL + "C");
WebElement hint = driver.findElement(By.xpath("((html/body/input)[2])"));
hint.sendKeys(Keys.CONTROL + "v");
 
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// 
	System.out.println(e);	
}

 driver.close();

	}

}
