package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		List<WebElement> search=driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.print(search.size());
		for(WebElement a: search) {
			System.out.println(a.getText());
			if(a.isSelected()) {
				System.out.println(a.getText());
			}
			
			WebElement selectoptions=driver.findElement(By.id("gh-cat"));
			Select s=new Select(selectoptions);
			s.selectByIndex(0);
			Thread.sleep(1000);
			s.selectByValue("550");
			s.selectByVisibleText("Books");
			
		}
	}

}
