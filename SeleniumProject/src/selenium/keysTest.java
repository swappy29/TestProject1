package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-CA&.intl=ca&pspid=2142623533&activity=uh-mail&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Dca%26.lang%3Den-CA%26.partner%3Dnone%26.src%3Dfp%26activity%3Duh-mail%26pspid%3D2142623533");
		driver.findElement(By.name("username")).sendKeys("sappu94");
		driver.findElement(By.name("username")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("32355356365353");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	}

}
