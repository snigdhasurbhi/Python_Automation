package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {
	 
		@FindBy(xpath="//input[@id='ap_email']")
		WebElement UN;

		@FindBy(id="continue")
		WebElement continue1;
		
		@FindBy(xpath="//input[@id='ap_password']")
		WebElement Password;
		
		@FindBy(id="signInSubmit")
		WebElement Submit;
		public Pom_class(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void user_name() {
			UN.sendKeys("snigdhasurbhi12@gmail.com");
		}
		public void cont() {
		continue1.click();;
		}
		public void password() {
			Password.sendKeys("snigdhasurbhi12@gmail.com");
		}
		public void submit() {
			Submit.click();
		}

}
