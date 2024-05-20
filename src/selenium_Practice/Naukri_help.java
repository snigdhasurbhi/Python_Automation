package selenium_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_help {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//a[@id='login_Layer']/div")).click();
		Thread.sleep(2000);
		String window=driver.getWindowHandle();
		System.out.println(window);//it will provide Id of particular browser
		driver.findElement(By.xpath("//span[.='Sign in with Google']")).click();
		driver.manage().window().maximize();
		Set<String> handle=driver.getWindowHandles();
		System.out.println(handle);
		Iterator<String> m =handle.iterator();
		String Parent=m.next();
		System.out.println(Parent);
		String Child=m.next();
		System.out.println(Child);
		driver.switchTo().window(Child);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("helloworldxyz17@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Testaccount1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(4000);
	//	driver.close();
		driver.switchTo().window(Parent);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='btn btn-block btn-large white-text']")).click();
		Thread.sleep(4000);
		WebElement upload = driver.findElement(By.id("attachCV"));
		upload.sendKeys("C:\\\\Users\\\\snigd\\\\Desktop\\\\Classic-Basic-_-Simple-Resume-Template-Turquoise.docx");
		Thread.sleep(2000);
		
		

	}



	}


