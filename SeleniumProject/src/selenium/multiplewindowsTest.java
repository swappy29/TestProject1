package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Strings;

public class multiplewindowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://moodle.cestarcollege.com/moodle/");
		driver.findElement(By.linkText("Faq")).click();
		Set<String>allwindows=driver.getWindowHandles();
		Iterator<String>itr=allwindows.iterator();
		String mainwindow=itr.next();
		String childwindow=itr.next();
		driver.switchTo().window(mainwindow);
		System.out.println(driver.getTitle());
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());


	}

}
