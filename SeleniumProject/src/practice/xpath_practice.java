package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class xpath_practice {
	public static void main(String [] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\Vrajesh\\\\Documents\\\\SeleniumJars//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		driver.findElement(By.id("login-email")).sendKeys("slkjddfjdfkfke");
		driver.findElement(By.id("login-password")).sendKeys("sdkhkfdhfkhd");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String s1=driver.findElement(By.xpath("//*[starts-with (text(),'The email address is invalid.')]")).getText();
		System.out.print(s1);
	}

}
