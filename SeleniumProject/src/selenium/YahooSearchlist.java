package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSearchlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		driver.findElement(By.id("header-search-input")).sendKeys("Iphone");
		Thread.sleep(1000);
		List<WebElement> search=driver.findElements(By.xpath("//div[@type='normal']/ul"));
		System.out.println(search.size());
		for(WebElement a:search) {
			System.out.println(a.getText());
		}
	}

}
