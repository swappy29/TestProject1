package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("C:\\\\Users\\\\Vrajesh\\\\Documents\\\\testing\\\\prop.properties");
		Properties prop=new Properties();
		prop.load(f);
		
		String browser=prop.getProperty("browser");
		
		
		WebDriver driver;
		if(browser.equals(prop.getProperty("browser"))) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
		 driver=new FirefoxDriver();
		}else if(browser.equals(prop.getProperty("browser"))) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\chromedriver.exe");
			 driver =new ChromeDriver();
			

		}else
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\chromedriver.exe");
			 driver =new ChromeDriver();
			
		}
		
		driver.get("https://www.adidas.ca/en/account-login");
		driver.findElement(By.id("login-email")).sendKeys("sjdhskdjsd");
		driver.findElement(By.id("login-password")).sendKeys("sjdhskdjsdasjdhhshjd");
		driver.findElement(By.tagName("button")).click();
		String expected="The email address is invalid.";
		

	}

}
