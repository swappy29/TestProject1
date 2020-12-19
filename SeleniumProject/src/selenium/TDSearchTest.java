package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDSearchTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();		
		driver.get("https://www.td.com/us/en/personal-banking/");
		driver.findElement(By.cssSelector("#span[class='td-icon']")).click();
		Thread.sleep(2000);
		Alert a1=driver.switchTo().alert();
		System.out.print(a1.getText());
		a1.dismiss();
	
	}

}
