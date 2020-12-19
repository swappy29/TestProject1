package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaysearchList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		driver.findElement(By.id("gh-ac")).sendKeys("Samsung");
		Thread.sleep(1000);
		List<WebElement>search=driver.findElements(By.xpath("//ul[@id='ui-id-1']"));
		System.out.println(search.size());
		for(int i=0;i<search.size();i++) {
			System.out.println(search.get(i).getText());
		}
	}

}
