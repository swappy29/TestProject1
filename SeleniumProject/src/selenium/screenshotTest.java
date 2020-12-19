package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class screenshotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement a=driver.findElement(By.id("draggable"));
		WebElement b=driver.findElement(By.id("droppable"));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(a, b).build().perform();
		if((b.getText()).equals("Dropped!")) {
			System.out.println("pass");
			
		}
		File scshot=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scshot,new File("C:\\Users\\Vrajesh\\Desktop\\screenshot.png"));
		
		
	}
	}


