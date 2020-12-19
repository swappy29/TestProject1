package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class backandforwardbuttontest {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.linkText("About")).click();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	System.out.println(driver.getTitle());
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	
}
}
