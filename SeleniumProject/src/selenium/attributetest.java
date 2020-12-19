package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class attributetest {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Vrajesh\\Documents\\SeleniumJars\\geckodriver.exe");
	FirefoxDriver driver =new FirefoxDriver();
	driver.get("https://www.ebay.ca/");
	String s="Search for anything";
	String result=driver.findElement(By.name("_nkw")).getAttribute("placeholder");
	System.out.println(result);
	driver.findElement(By.name("_nkw")).sendKeys("Samsung");
	String s1=driver.findElement(By.name("_nkw")).getAttribute("value");
	System.out.println(s1);
	//if(result.equals(s)) {
	//	System.out.println("pass");
	//}else {
	//	System.out.println("fail");
	//}
}
}
