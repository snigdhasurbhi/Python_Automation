package selenium_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestioin_in_amazon_puma {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe"); // for launching driver set property
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
//WebElement dropdown =		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
////input [@id='twotabsearchtextbox']
		WebElement dropdown =		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
dropdown.sendKeys("onepluse");
// WebDriverWait wait = new WebDriverWait(Duration.ofSeconds(10));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.titleContains("amazon"));
List<WebElement> auto =	driver.findElements(By.xpath("//div[@ id='nav-flyout-searchAjax']/div//div[@ class='s-suggestion-container']"));
int no_of_count = auto.size();
System.out.println(no_of_count);

Thread.sleep(10);
auto.get(no_of_count -1 ).click();

Thread.sleep(10);

 driver.close();
	}

}
