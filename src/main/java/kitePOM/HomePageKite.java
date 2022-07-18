package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageKite 
    {
              //1.data members
	          @FindBy(xpath = "//span[@class='user-id']")private WebElement UserName;
	          @FindBy(xpath = "//a[@target='_self']") private WebElement LogoutButton;
	          
	          //4.constructor
	           public HomePageKite(WebDriver driver)
	           {
	        	   PageFactory.initElements(driver, this);
	           }
	           
	           //3.methods
	           public void validateUserName(String expecteduserID)
	           {
	        	  String ActualUserName = UserName.getText();
	        	   String expecteduserName = expecteduserID;
	        	   if(ActualUserName.equals(expecteduserName))
	        	   {
	        		   System.out.println("User ID matching Tc is PASSED");
	        	   }
	        	   else 
	        	   {
	        		   System.out.println("User ID not matching Tc is FAILED");
	        	   }
	        	   
	           }
	           public String getActualUID()
	           {
	        	   String actualUID = UserName.getText();
	        	   return actualUID;
	        	   
	           }
	           public void clickLogoutButton() throws InterruptedException 
	           {
	        	   UserName.click();
	        	   Thread.sleep(300);
	        	   LogoutButton.click();
	           }
	           
    }
