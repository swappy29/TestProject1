package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class webelementtext {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		WebElement lname=driver.findElement(By.name("lastname"));
		lname.sendKeys("Patel");
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("9428799808");
		WebElement password=driver.findElement(By.id("password_step_input"));
		password.sendKeys("jabsvbabdaadbnad");
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(1000);
		
		
		
	}

}
