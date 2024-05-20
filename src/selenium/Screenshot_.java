package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_ {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/snigd/Downloads/learningHTML.html");
		
	driver.switchTo().alert().accept();  // yes
	driver.switchTo().alert().dismiss();   
	TakesScreenshot  t1 = (TakesScreenshot) driver;
File F1_origin	= t1.getScreenshotAs(OutputType.FILE);
File f2 = new File("C:\\Users\\snigd\\Desktop.png");
FileUtils.copyFile(F1_origin, f2);
	
}

	}


