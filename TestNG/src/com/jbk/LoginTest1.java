package com.jbk;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest1 {
  @Test(priority=0)
  public void aaLogintestcase1() {
	  
	  System.out.println(1);
	  Assert.assertEquals(3, 3);
	  System.out.println(2);
	  Assert.assertEquals(3, 4);
	  System.out.println(3);
	  Assert.assertEquals(3, 3);
     System.out.println(4);
	  Assert.assertEquals(3, 6);
	  
  }
  
  @Test(priority=1)
  public void aaaLogintestcase2() {
	  
	  System.out.println(5);
	  Assert.assertEquals(3, 3);
	  System.out.println(6);
	  Assert.assertEquals(3, 4);
	  System.out.println(7);
	  Assert.assertEquals(3, 3);
	  System.out.println(8);
	  Assert.assertEquals(3, 6);
	  System.out.println(9);
	  
  }
}
