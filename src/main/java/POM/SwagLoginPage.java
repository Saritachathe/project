package POM;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class SwagLoginPage {
		
		@FindBy (xpath="//input[@id='user-name\']") private WebElement Username;
		@FindBy (xpath="//input[@id='password\']") private WebElement password;
		@FindBy (xpath="//button[@id='login-button\']") private WebElement Login;

		
		public SwagLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			}
		public void enterUsername(String user)
		{
			Username.sendKeys (user);
			
		}
		public void enterpassword(String pass)
		{
			password.sendKeys(pass);
		}
		public void ClickOnLogIn() {
			Login.click();
		}

	}



