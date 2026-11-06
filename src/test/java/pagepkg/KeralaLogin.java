package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeralaLogin {

	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(xpath = "//*[@id=\"upass\"]")WebElement password;
	@FindBy(xpath = "//*[@id=\"sub_logbtn\"]")WebElement loginbtn;
	
	 public KeralaLogin(WebDriver driver)
	 {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public String titleverficationmthd()
	 {
		 String title = driver.getTitle();
		 return title;
	 }
	 
	 public void loginmthd(String un, String pass)
	 {
		 username.sendKeys(un);
		 password.sendKeys(pass);
		 loginbtn.click();
	 }
}
