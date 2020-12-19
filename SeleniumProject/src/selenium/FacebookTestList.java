package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTestList {
	
	
	
		
		
	
	public static void main(String [] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();		
		driver.get("https://www.facebook.com/");
	
	
		WebElement footer=driver.findElement(By.xpath("//div[@class='_8opy _95ke']"));
		//List<WebElement> alllinks=footer.findElements(By.tagName("a"));
		List<WebElement> alllinks=footer.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(int i=0;i<alllinks.size();i++) {
			System.out.println(alllinks.get(i).getText());
		}
		
		
		

}

}
