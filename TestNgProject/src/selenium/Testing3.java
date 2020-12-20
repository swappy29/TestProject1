package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	SoftAssert softassert=new SoftAssert();
  @Test(priority=1)
  public void createuser() {
	  System.out.println("I'm in HomeTest");
	  System.out.println("Before Assertion");
	  Assert.assertTrue(2>3, "Invalid Value");
	  System.out.println("After Assertion");
	  Assert.assertEquals("ABC", "ABC");
  
  }
  @Test(priority=2,dependsOnMethods="createuser")
  public void edituser() {
	  System.out.println("I'm in HomeTest");
	  System.out.println("Before Assertion");
	  softassert.assertTrue(2>3, "Invalid Value");
	  System.out.println("After Assertion");
	  	  softassert.assertAll();
	  
  
  }
  
  @Test(priority=3,dependsOnMethods="edituser")
  public void deleteuser() {
	  System.out.println("I'm in HomeTest");
	  System.out.println("Before Assertion");
	  softassert.assertTrue(2>3, "Invalid Value");
	  System.out.println("After Assertion");
	  softassert.assertEquals("ABC", "ABC");
	  softassert.assertAll();
	  
  
  }
}
