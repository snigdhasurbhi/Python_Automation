package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle_itrator {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);
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
	Thread.sleep(3000);
	driver.switchTo().window(Child);
	
WebElement Email =	driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
 Email.sendKeys("helloworldxyz17@gmail.com");
 Thread.sleep(4000);
 WebElement Next = driver.findElement(By.xpath("(//span[.='Next'])"));
 Next.click();
 Thread.sleep(4000);
WebElement Password = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
Password.sendKeys("Testaccount1");
driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]")).click();
// driver.findElement(null)

// driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
 Thread.sleep(4000);
	// driver.close();
	driver.switchTo().window(Parent);
	Thread.sleep(4000);
// (//div[@class='commonHeaderFooter'])[1]	
	// driver.findElement(By.xpath("(//div[@class='commonHeaderFooter'])[1]")).click();
	//  driver.findElement(By.xpath("//div[@id='_f6i5jotn3Navbar']")).click();
 /* WebElement detail =	driver.findElement(By.xpath("//div[@id='userInput__r5evo6j57InputBox']"));
WebElement text = driver.findElement(By.xpath("//div[@class='textArea']"));
text.sendKeys("hello");   */
	
	driver.navigate().refresh();
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//div[@class='btn btn-block btn-large white-text']")).click();
	Thread.sleep(4000);
	////a[.='Upload']
// 	WebElement upload =	driver.findElement(By.xpath("//a[.='Upload']"));	
	// //span[.='Attach Resume']
//	WebElement upload =	driver.findElement(By.xpath("//span[.='Attach Resume']"));	
 WebElement upload =	driver.findElement(By.xpath("//input[@id='attachCV']"));
 Thread.sleep(2000);
//  upload.click();
 
 
 //Thread.sleep(4000);
 upload.sendKeys("C:\\Users\\snigd\\Desktop\\Classic-Basic-_-Simple-Resume-Template-Turquoise.docx");
System.out.println("uploaded resume");
Thread.sleep(4000);
driver.quit();
	//detail.sendKeys("hi i m xyz");
//	driver.findElement(By.xpath("//div[@class='sendMsg']")).click(); // for icon to send value 
//	driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
//	driver.quit();
	

	}

}
