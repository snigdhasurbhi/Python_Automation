package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//div[text()='Login']")).click();

Thread.sleep(2000);
// (//div[.='login']
driver.findElement(By.xpath("//span[.='Sign in with Google']")).click();	
String handle =	driver.getWindowHandle();
System.out.println("id of the browser" + handle);
Set<String>	id =  driver.getWindowHandles();  
System.out.println(id);
	
	}
	
	

}
