package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pomlogin {
	@FindBy(linkText="Start here.")
     WebElement clickhere;
	
	@FindBy(id="ap_customer_name")
    WebElement UserName;

	
	public static void ToClick() {
	this.clickhere();
	}
	
	public static void TosenUserName(String Username) {
		this.UserName.sendKeys(Username);
		}
	

	
