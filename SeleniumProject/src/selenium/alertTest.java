package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		driver.findElement(By.name("B2")).click();
		Thread.sleep(2000);
		Alert a1=driver.switchTo().alert();
		System.out.print(a1.getText());
		a1.dismiss();//to click on particular unselected option in alert box
		//a1.accept();//to click on selected option in particular alertbox
		
		
		
	}

}
