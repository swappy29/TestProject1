package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class webdrivertext {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
	//class name object name=new class name(); to create object
	//Interface(Parent class) object name=new class name(); you can use interface name 
	WebDriver driver=new FirefoxDriver();
	 driver.get("https://www.facebook.com/");
}
}
