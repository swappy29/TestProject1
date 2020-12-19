package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		List<WebElement> s1=driver.findElements(By.id("draggable"));
		System.out.println(s1.size());
		
		List<WebElement> s2=driver.findElements(By.linkText("Sortable"));
		System.out.println(s2.size());
		for(WebElement a:s2) {
			System.out.println(a.getText());
		}
		driver.switchTo().frame(0);
		
		
		 s1=driver.findElements(By.id("draggable"));
		System.out.println(s1.size());
		
	 s2=driver.findElements(By.linkText("Sortable"));
		System.out.println(s2.size());
		for(WebElement a:s2) {
			//System.out.println(a.getText());
		}
		
		
		
		
	}

}
