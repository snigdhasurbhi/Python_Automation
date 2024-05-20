package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsXpath_radiobtn {

	public static void main(String[] args) {
		// (html/body/input)[4] Who are you
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/snigd/Downloads/learningHTML.html");
		driver.findElement(By.xpath("((html/body/input)[4] )")).click();  // selecting male radiobtn

	}

}
