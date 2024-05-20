package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Google {

	public static void main(String[] args) {
		//
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("india");
try{
	Thread.sleep(2000);
}  
catch (InterruptedException e) {
	// 
	System.out.println(e);
}
List<WebElement> auto=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
 int no_of_count = auto.size();
System.out.println(no_of_count);

try{
	Thread.sleep(2000);
}  
catch (InterruptedException e) {
	// 
	System.out.println(e);
}

auto.get(no_of_count -10 ).click();

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// 
	e.printStackTrace();
	System.out.println(e);
}
driver.close(); 
	}

}
