package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class First_class {

	public static void main(String[] args) 
	{
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\snigd\\Downloads\\chromedriver_win32.exe");
				WebDriver driver=new ChromeDriver();

			}


	}

/* System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();  */
