package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartTesthoverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Actions Builder=new Actions(driver);
		WebElement men=driver.findElement(By.xpath("(//div[@class='_1fwVde'])[3]/a\r\n"));
		Builder.moveToElement(men).build().perform();	}

}
