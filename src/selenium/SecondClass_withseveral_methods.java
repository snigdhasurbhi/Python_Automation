package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass_withseveral_methods {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");  // used get method to open the amazon browser
 String a =	driver.getTitle(); // ruturning get title value to a string or storing gettitle value to string a
 System.out.println(a);  // a value will be printed 
      String b = driver.getCurrentUrl();	// will get  getcurrent url
      System.out.println(b);     // getcurrent url will be print in console.
 driver.close();  // closing the current browser
 driver.quit();  // closing parent and child browser, we will study later
	
	
	
	
	}
	
	
	

}
