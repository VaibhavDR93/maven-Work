package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PinPageKite 
   {
              //1.data members
	          @FindBy(id = "pin") private WebElement pin;
	          @FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
	          
	          //2.constructor
	          public PinPageKite(WebDriver driver)
	          {
	        	  PageFactory.initElements(driver, this);
	          }
	          
	         //3.methods
	          public void sendpin(String pincode) 
	          {
	        	  pin.sendKeys(pincode);
	          }
	          public void clickContinueButton()
	          {
				continueButton.click();
			  }
   }
