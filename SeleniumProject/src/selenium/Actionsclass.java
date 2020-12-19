package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		WebElement e1=driver.findElement(By.linkText("Electronics"));
		Actions Builder=new Actions(driver);
		Builder.moveToElement(e1).build().perform();
		List <WebElement> s1=driver.findElements(By.xpath("(//div[@class='hl-cat-nav__sub-cat-col']/ul)[5]/li"
				+ ""));
		System.out.println(s1.size());

	}

}
