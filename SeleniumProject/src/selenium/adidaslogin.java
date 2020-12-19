package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class adidaslogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		driver.findElement(By.id("login-email")).sendKeys("sjdhskdjsd");
		driver.findElement(By.id("login-password")).sendKeys("sjdhskdjsdasjdhhshjd");
		driver.findElement(By.tagName("button")).click();
		String expected="The email address is invalid.";
		
	}

}
