package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class gmaillogintest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sakjdhsahfhdaf");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		String Actual_msg=driver.findElement(By.className("o6cuMc")).getText();
		System.out.println(Actual_msg);
		
		
		

		
	}

}
