package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_1st_class {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
   // driver.get("https://www.amazon.in/");  
   //  driver.get("https://www.flipkart.com/");
		driver.get("https://www.google.com/");
     
  //   driver.quit();
  String a =   driver.getTitle();   // returnig the value in a variable return 
  System.out.println(a);
    
  String b = driver.getCurrentUrl();
  System.out.println(b);  
  driver.findElement(By.linkText("Gmail")).click();     // locator is "linktext", "gmail" is value to the locator  and action is click method.
 // twotabsearchtextbox
  
  driver.close();
     
     
     
     
     
	}

}
