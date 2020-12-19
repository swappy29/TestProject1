package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars//geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=53qOsxqnZnU&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvY2FcL2VuXC9wZXJzb25hbC5odG1sIiwib2F1dGhfa2V5IjoiNTNxT3N4cW5ablUiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYwNjY4NzUzNywiaWF0IjoxNjA2Njg2MzM3LCJqdGkiOiI5Njc0ODBmZC03MmVlLTQwOWItYTZhNy0zNDEzMTRkYWM1MjEiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifX0.vOUQFM-0yB9bO-3eWfUOekrkAA72lqKeD5xTGAH0ZUsTnWWnjwBthU7rhWR2TT8-EEl5VmCsbc9tb9oqkjwPBSS6g9NVaxdUDOb6J7UCXswePE3seSYuHA8NVoeCS9hB-tWyGqULRa8UtBcH5EVzL_52piW1eUJJVIPSbLqsm_fOAEKLB88dTyG7KdUiryhVAhNqx_E8cg215H862ct32tS8xVYe63F__-iQA6j8tBVX2FF4UZBLN5iMpU-YUR9BA0s6o0FE-2GzcjKSznI4wBNTDHKvPjouNTHeIV25EMShYxYCHm4tbIKeE4FNSEIcNQ413oOqjCvdM1p5Eh6RHg&preferred_environment=");
		driver.findElement(By.cssSelector("#usernameInput-input")).sendKeys("dfkjvejv");
		driver.findElement(By.cssSelector("#password-input")).sendKeys("dfkjvejv");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='Checkbox__span']")).click();
		driver.findElement(By.className("ButtonCore__block")).click();
		String Actual="Please check your card number / username or password and try again.";
		String Expected=driver.findElement(By.id("globalError")).getText();
		if(Expected.equals(Actual)){
			System.out.println("pass");
			
		}
		List<WebElement> search=driver.findElements(By.name("group1"));
		System.out.print(search.size());
		for(WebElement a: search) {
			System.out.println(a.getAttribute("value")+"-----"+a.isSelected());
			
			search.get(2).click();
			}
		
		
	}
	}

