package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LoginPage {
WebDriver driver;

public void OpenBrowser() {
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\geckodriver.exe");	
	 driver=new FirefoxDriver();
	
}
public void OpenYahoo() {
	driver.get( "https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-CA&.intl=ca&pspid=2142623533&activity=uh-mail&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Dca%26.lang%3Den-CA%26.partner%3Dnone%26.src%3Dfp%26activity%3Duh-mail%26pspid%3D2142623533");
    
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	
}
public void EnterUsername(String a) throws InterruptedException {
	 driver.findElement(By.id("login-username")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.name("username")).sendKeys(a);
	 driver.findElement(By.id("login-signin")).click();
	
}
public void EnterPassword(String b) throws InterruptedException {
	driver.findElement(By.id("login-passwd")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.id("login-passwd")).sendKeys(b);
	 driver.findElement(By.id("login-signin")).click();
	
}
public String ReadEmailErrorMessage() throws InterruptedException {
	String Actual=driver.findElement(By.className("error-msg")).getText();
	Thread.sleep(1000);
	 System.out.println(Actual);
	 
	return Actual;
		
	
}
public String ReadPasswordErrorMessage() throws InterruptedException {
	 String Actual=driver.findElement(By.className("error-msg")).getText();
	 Thread.sleep(1000);
		System.out.println(Actual);
		return Actual;
		 
}
public void CloseBrowser() {
	
	
}
}
