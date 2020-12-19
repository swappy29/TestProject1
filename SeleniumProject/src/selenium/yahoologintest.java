package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class yahoologintest {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-CA&.intl=ca&pspid=2142623533&activity=uh-mail&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Dca%26.lang%3Den-CA%26.partner%3Dnone%26.src%3Dfp%26activity%3Duh-mail%26pspid%3D2142623533");
		driver.findElement(By.name("username")).sendKeys("sdjeifjkdscjsdnvsdn,cvds");
		//driver.findElement(By.id("pass")).sendKeys("java444c");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(2000);
		
		String expected_result="Sorry, we don't recognize this email.";
		String actual_result= driver.findElement(By.id("username-error")).getText();
		System.out.print(actual_result);
		if(actual_result.equals(expected_result)) {
			System.out.print("pass");
		}else {
			System.out.print("fail");

		}

	}

}
