package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.KeralaLogin;

public class KeralaBaseClass {

	public static WebDriver driver;
	
	public KeralaLogin loginobj;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void objectmthd()
	{
		loginobj = new KeralaLogin(driver);
	}
}
