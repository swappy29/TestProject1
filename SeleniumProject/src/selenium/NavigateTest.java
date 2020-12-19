package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		//driver.get("http://www.echoecho.com/javascript4.htm");
		
		driver.navigate().to("http://www.echoecho.com/javascript4.htm");//navigate method is same method as get but in navigate we have more methods such as navigate back,refresh,forward.
	}

}
