package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class facebooksignuoclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
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
		Thread.sleep(1000);
		
		String expected_result="What’s your name?";
		String actual_result= driver.findElement(By.id("js_8")).getText();
		System.out.print(actual_result);
		if(actual_result.equals(expected_result)) {
			System.out.print("pass");
		}else {
			System.out.print("fail");

		}

		
	}

}
