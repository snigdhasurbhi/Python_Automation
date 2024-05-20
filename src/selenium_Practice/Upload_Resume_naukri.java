package selenium_Practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_Resume_naukri {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// (//div[.='login']
		driver.findElement(By.xpath("//span[.='Sign in with Google']")).click();	
		String handle =	driver.getWindowHandle();
		System.out.println("id of the browser" + handle);
		Set<String>	id =  driver.getWindowHandles();  
		System.out.println(id);
	Iterator<String> I = id.iterator();
	String Parent = I.next();
	String Child = I.next();
	System.out.println(Parent);
	System.out.println(Child);
	
	driver.switchTo().window(Child);
	
WebElement Email =	driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
Thread.sleep(10);
 Email.sendKeys("helloworldxyz17@gmail.com");
 Thread.sleep(10);
WebElement Next = driver.findElement(By.xpath("(//span[.='Next'])"));
Thread.sleep(10);
 
 
 Next.click();
Thread.sleep(10);
WebElement Password = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
Thread.sleep(10);
Password.sendKeys("Testaccount1");
driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]")).click();

Thread.sleep(10);
	driver.switchTo().window(Parent);
Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@class='btn btn-block btn-large white-text']")).click();
	
	//  WebElement upload =	driver.findElement(By.xpath("//input[@id='attachCV']"));
	WebElement upload =	driver.findElement(By.id("attachCV"));
	
	 upload.sendKeys("C:\\Users\\snigd\\Desktop\\Classic-Basic-_-Simple-Resume-Template-Turquoise.docx");
	 System.out.println("uploaded resume");
	
	 driver.quit();

	}

}
