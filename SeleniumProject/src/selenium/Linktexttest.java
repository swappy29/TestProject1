package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Linktexttest {
	public static void main(String [] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\geckodriver.exe");
	FirefoxDriver driver =new FirefoxDriver();
	
	driver.get("https://www.google.com/");
//	driver.findElement(By.id("email")).sendKeys("swapnilpatel94@yahoo.com");
//	driver.findElement(By.id("pass")).sendKeys("java444c");
	driver.findElement(By.linkText("About")).click();
	//driver.findElement(By.partialLinkText("Abo")).click();
	String Expected_result="https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
	String Actual_result=driver.getCurrentUrl();
	System.out.println(Actual_result);
	if(Actual_result.equals(Expected_result)) {
		System.out.println("Pass");
	}else {
		System.out.println("fail");
	}
	String Expected_title="Google - About Google, Our Culture & Company News";
	String Actual_title=driver.getTitle();
	System.out.println(Actual_title);
	if(Actual_title.equals(Expected_title)) {
		System.out.println("Pass");
	}else {
		System.out.println("fail");
	}
		
	}	
}
