package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlesuggestionlisttest {
	private static final List<WebElement> WebElement = null;

	public static void main(String [] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("canada");
	Thread.sleep(1000);
	List<WebElement> search=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	System.out.println(search.size());
	//for(int i=0;i<search.size();i++) {
	//	System.out.println(search.get(i).getText());
		
	//}
	for(WebElement a:search)
	{
		System.out.println(a.getText());
		if(!(a.getText().contains("Canada")|| a.getText().contains("canada"))){
			System.out.print("fail");
			
		}
	}
	
		
}
}
