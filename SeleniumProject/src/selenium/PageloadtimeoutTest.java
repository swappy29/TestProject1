package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PageloadtimeoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//It's generic when we use implicit wait it will applicable for all the elements after declaration of implicit wait. In implicit wait 20 is a maximum time till that it will try to find any element if it is not found Thread. sleep is declaring fixed time unless 10 or 20 seconds it will wait it does not matter elements are found or not.
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.name("lastname")).sendKeys("Patel");
		driver.findElement(By.name("reg_email__")).sendKeys("9428799808");
		driver.findElement(By.id("password_step_input")).sendKeys("jabsvbabdaadbnad");
		List<WebElement> dropdown1=driver.findElements(By.id("month"));
		Select d1=new Select(driver.findElement(By.id("month")));
		d1.selectByVisibleText("Mar");
		
		Select d2=new Select(driver.findElement(By.id("day")));
		d1.selectByVisibleText("15");
		Select d3=new Select(driver.findElement(By.id("year")));
		d1.selectByVisibleText("2000");
		driver.findElement(By.name("websubmit")).click();
		
	}

}
