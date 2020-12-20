package tests;
import data.Read_write_excelfiles;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import data.Read_write_excelfiles;
import pages.LoginPage;
import utilities.XLS_Reader;

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
    Read_write_excelfiles r=new Read_write_excelfiles();
   
    
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
	lp.EnterUsername(r.CorrectEmail);
	lp.EnterPassword(r.WrongPassword);
	String Actual=lp.ReadPasswordErrorMessage();
	String expected=r.PasswordErr_msg;
	Assert.assertEquals(Actual, expected);

	 
	 

		}
  @Test
  public void LoginWrongEmailTest() throws InterruptedException {
	  lp.EnterUsername(r.WrongEmail);
	
	String Actual=lp.ReadEmailErrorMessage();
	String expected=r.EmailErr_msg;
	 Assert.assertEquals(Actual, expected);
	
		

		}
	  
  }

