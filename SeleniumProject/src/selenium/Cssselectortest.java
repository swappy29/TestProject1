package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselectortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("sdlkjasdskjdl");
		driver.findElement(By.cssSelector("#pass")).sendKeys("sdlkjasdskjdl");
		driver.findElement(By.cssSelector("button[type='submit'][id='u_0_b']")).click();
	}

}
