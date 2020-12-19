package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class missisagaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.mississauga.ca/");
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		List<WebElement>links=driver.findElements(By.xpath("//ul[@class='main-nav-links']/li[3]/button\r\n"));
		System.out.println(links.size());
		for(WebElement a:links)
		{
			System.out.println(a.getText());
		}
		
	}

}
