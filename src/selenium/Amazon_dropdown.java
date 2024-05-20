package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_dropdown {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
WebElement All	=	driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//select[@id='searchDropdownBox']
Select s= new Select(All);
// s.selectByValue("search-alias=stripbooks"); books 
 s.selectByVisibleText("Amazon Fashion");  // this method is used for dropdown
 // s.selectByIndex(5);  // 
	}

}
