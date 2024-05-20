package selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			//
			System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/snigd/Downloads/learningHTML.html");
			
		driver.switchTo().alert().accept();  // yes
		driver.switchTo().alert().dismiss();   
	}

}
