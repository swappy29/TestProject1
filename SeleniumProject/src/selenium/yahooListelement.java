package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahooListelement {
	public static void main(String [] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://ca.yahoo.com/");
	//write code for findelement span
	driver.findElement(By.xpath("//li[contains(@class,'trending-list')])[1]/ul/li"
			));
	Thread.sleep(2000);
	List<WebElement> alllinks=driver.findElements(By.tagName("a"));
	System.out.println(alllinks.size());
	for(int i=0;i<alllinks.size();i++) {
		System.out.println(alllinks.get(i).getText());
	}
	}
}
