package selenium;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;



public class Testing3 {
	@Rule
	public ErrorCollector err=new ErrorCollector();
	@Test
	public void Test6() {
		String Expected="ABC";
		String Actual="ABC";
		System.out.println("before assert1");
		Assert.assertEquals(Expected, Actual);
		System.out.println("After assert1");
		
		System.out.println("before assert2");
		
		Assert.assertTrue(2>1);
		System.out.println("After assert2");
		
		
		
	}
	//@Ignore //Ignore is used to skip the test but you can see there are how many test cases and how many executed and how many skipped 
	//whereas // will not execute test
	@Test
	public void Test7() {
		String Expected="ABC";
		String Actual="ABC1";
		System.out.println("before assert1");
		try {
		Assert.assertEquals(Expected, Actual);
		
		}catch(Throwable t) {
			System.out.println("after assert1");
			err.addError(t);
		}	
			
		try {
			Assert.assertTrue(2>1);
			}catch(Throwable t) {
			System.out.println("After assert2");
			err.addError(t);
			}
			
		
		
		
		
		
	}
	

}
