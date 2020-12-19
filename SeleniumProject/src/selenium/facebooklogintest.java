package selenium;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebooklogintest {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
