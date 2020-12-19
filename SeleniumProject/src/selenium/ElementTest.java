package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		List <WebElement> s=driver.findElements(By.linkText("About"));
		System.out.println(s.size());
		if(s.size()>0) {
			System.out.println("present");
			
		}else {
			System.out.println(" not present");
		}
		
	}

}
