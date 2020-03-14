import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pom.pomlogin;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(WebDriver.chrome.driver,"C:\\prasanna\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");//launch chrome driver
		driver.navigate().to("http://www.amazon.in/");//launch amazon site
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
		pomlogin.ToClick();//Directs to new customer creation page
		driver.findElement(By.id("ap_customer_name")).sendKeys("Prasanna");
		driver.findElement(By.id("aap_phone_number")).sendKeys("9908456743");
		driver.findElement(By.id("ap_password")).sendKeys("123456");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("auth-pv-enter-code")).sendKeys("123456");
		driver.findElement(By.id("auth-verify-button")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Titan watch");
		driver.findElement(By.className("nav-input")).click();	
		Select feature=new Select(driver.findElement(By.id("s-result-sort-select_0")));
		feature.selectByIndex(2);
		driver.findElement(By.linkText("Analog Silver Dial Men's Watch-NL90009BM01")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
		driver.findElement(By.linkText("Signout")).click();
		driver.close();
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}
