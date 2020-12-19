package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.nike.com/ca/");
		
		Actions Builder=new Actions(driver);
		WebElement men=driver.findElement(By.xpath("(//a[@role='menu'])[2]"));
		Builder.moveToElement(men).build().perform();
		List<WebElement> searchlinks=driver.findElementsByXPath("//div[@id='DesktopMenu-0-1-0']//div[1]/div[2]/a");
	
		System.out.println(searchlinks.size());
		for(WebElement a: searchlinks)
		{
			System.out.println(a.getText());
		}

		
	}

}
