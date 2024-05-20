package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String handle =	driver.getWindowHandle();
		System.out.println("id of the browser" + handle);
	Set<String>	id =  driver.getWindowHandles();  
System.out.println(id);  // return the value in the array as inside []

	}

}
