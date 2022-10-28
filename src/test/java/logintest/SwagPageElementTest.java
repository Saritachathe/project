package logintest;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import POJO.Browser;
	import POM.SwagLoginPage;
	import Utility.Parametrization;

	public class SwagPageElementTest {
				WebDriver driver;
				
				@BeforeMethod
				public void openChromeBrowser()
				{
					driver = Browser.OpenBrowser();
				}
				
				@Test
				public void validateZerodhaLogin() throws EncryptedDocumentException, IOException
				{
					System.out.println("hello");
					SwagLoginPage A = new SwagLoginPage(driver);
					A.enterUsername(Parametrization.getExcelData("DATA", 1, 1));
					A.enterpassword(Parametrization.getExcelData("DATA", 2, 1));
					A.ClickOnLogIn();
				}


}
