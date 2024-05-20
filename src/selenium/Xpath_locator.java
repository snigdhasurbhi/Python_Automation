package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_locator {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/snigd/Downloads/learningHTML.html");
	//	driver.findElement(By.xpath("((html/body/input)[1])")).sendKeys("snigdha");  //click();
	//	driver.findElement(By.xpath("((html/body/input)[2])")).sendKeys("name");
     //   driver.findElement(By.xpath("((html/body/input)[3])")).sendKeys("surbhi");
     //   driver.findElement(By.xpath("((html/body/form/input)[1])")).sendKeys("Fname");
		//  driver.findElement(By.xpath("((html/body/form/input)[3])")).click(); 
	//	driver.findElement(By.xpath("((html/body/input)[5])")).click();  // for female radio btn
		driver.findElement(By.xpath("((html/body/input)[6])")).click(); 
		
	//	driver.close();
 
	}

}
