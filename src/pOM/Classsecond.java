package pOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Classsecond {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		 ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement hoverover = 	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Actions a = new Actions(driver);  // action class is used for hover function for mouse event 
		a.moveToElement(hoverover).perform();
		WebElement  signin = driver.findElement(By.xpath("//span[.='Sign in']"));
		signin.click();
		Pom_class user = new Pom_class(driver);
	//	user.UN;
		user.user_name();
		user.cont();
		user.password();
		user.submit();

	}

}
