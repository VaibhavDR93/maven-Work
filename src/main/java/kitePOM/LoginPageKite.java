package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageKite 
 {
	               //1.data members 
	       @FindBy(id = "userid") private WebElement Userid;
	       @FindBy(id = "password") private WebElement password;
	       @FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	               //2.constructor
	
	       public LoginPageKite(WebDriver driver) 
	      {
		     PageFactory.initElements(driver, this);
	      }
	
	                //3.methods
	       
	       public void sendUserID(String UserId)
	       {
	    	   Userid.sendKeys(UserId);
	       }
	       public void sendPassword(String PASSWORD)
	       {
	    	   password.sendKeys(PASSWORD);
	       }
	       public void clickloginButton() 
	       {
	    	   loginButton.click();
	       }
	

 }
