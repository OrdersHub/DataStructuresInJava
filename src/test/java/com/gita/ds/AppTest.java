package com.gita.ds;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class AppTest {

  @Test
  public void testAdd() {
	  App app = new App();
	  assertEquals(app.add(5, 6), 11, "faile add");
  }
  
  @Test
  public void testIsEven() {
	  App app = new App();
	  assertTrue(app.isEven(4));
	  
  }
}
