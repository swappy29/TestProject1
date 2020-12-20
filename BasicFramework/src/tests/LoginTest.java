package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {
    public WebDriver driver;
    LoginPage lp=new LoginPage();
    String CorrectEmail;
    String WrongEmail;
    String WrongPassword;
    String EmailErr_msg;
    String PasswordErr_msg;
    
    
  @BeforeMethod
  public void beforeMethod() {
	  lp.OpenBrowser();
	  lp.OpenYahoo();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  lp.CloseBrowser();
	 
  }
  
  @Test
  public void LoginWrongPasswordTest() throws InterruptedException {
	lp.EnterUsername(CorrectEmail);
	lp.EnterPassword(WrongPassword);
	String Actual=lp.ReadPasswordErrorMessage();
	String expected=PasswordErr_msg;
	Assert.assertEquals(Actual, expected);

	 
	 

		}
  @Test
  public void LoginWrongEmailTest() throws InterruptedException {
	  lp.EnterUsername(WrongEmail);
	
	String Actual=lp.ReadEmailErrorMessage();
	String expected=EmailErr_msg;
	 Assert.assertEquals(Actual, expected);
	
		

		}
	  
  }

