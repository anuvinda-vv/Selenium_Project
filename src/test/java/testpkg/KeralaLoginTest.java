package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.KeralaBaseClass;

public class KeralaLoginTest extends KeralaBaseClass{

	@Test(priority = 1)
	public void titlemthd()
	{
		String actualtitle = loginobj.titleverficationmthd();
		Assert.assertEquals(actualtitle,"kerala property");
		
	}
	
	@Test(priority = 2)
	public void loginvalidationmthd()
	{
		loginobj.loginmthd("abc@gmail.com" , "1234");
		
	}
}
