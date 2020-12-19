package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WeblistTest {
	
	public void launchbrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();		
		driver.get("https://www.google.com/");
	
	
		WebElement footer=driver.findElement(By.id("fsl"));
		List<WebElement> alllinks=footer.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(int i=0;i<alllinks.size();i++) {
			System.out.println(alllinks.get(i).getText());
		}
		
	}
	
	
		
		
	
	public static void main(String [] args) {
		WeblistTest obj=new WeblistTest();
		obj.launchbrowser();
		
		
		

}
}
