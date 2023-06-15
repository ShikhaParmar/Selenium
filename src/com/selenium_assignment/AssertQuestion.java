package com.selenium_assignment;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AssertQuestion {
	
	
	@Test
	public void test1() {
		int a=10, b=12;
		Assert.assertTrue(a<b);
		Assert.assertFalse(a>b);
		
	}
	@Ignore
	@Test
	public void test2() {
		String s1="Selenium";
		String s2=null;
		Assert.assertNull(s2);
		Assert.assertNotNull(s1);
		
	}
	@Ignore
	@Test
	public void test3() {
		int i1=1,i2=1;
//		String s1="tops";
//		String s2="Tops";
//		Assert.assertSame(s1, s2);
//		Assert.assertNotSame(s1, s2);
		Assert.assertEquals(i1, i2);
		
	}
	@Ignore
	@Test
	public void test4() {
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4};
		
		Assert.assertArrayEquals(b, a);
	}
	@Ignore
	@Test
	public void test5() {
		System.out.println("This is self failed....");
		fail("self failed");
		
		
	}
	

}
