package testNg_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {

	@Test
	public void m1()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		Assert.assertEquals("A", "B");//---->Assertion Fail
		System.out.println("Step3");
		System.out.println("Step4");
	}
	
	@Test
	public void m2()
	{
		String expData="Qspiders";
		String actData="Qspiders";
		Assert.assertEquals(actData, expData);
		
	}
	
	@Test
	public void m3()
	{
		String expData="Qspiders";
		String actData="Qspiders";
		Assert.assertEquals(actData, expData, "Assert FAIL");
		System.out.println("Assert PASS");
	}
	
	@Test
	public void m4()
	{
		int ExpData=10;
		int actData=20;
		Assert.assertEquals(actData, ExpData, "Assert FAIL");
		System.out.println("Assert PASS");
	}
	
	@Test
	public void m5()
	{
		int expData=10;
		int actData=20;
		Assert.assertNotEquals(actData, expData,"ASSERT EQUAL");
		System.out.println("ASSERT NOT EQUAL");
	}
	
	@Test
	public void m6() {
		String ExpData= "karthika";
		String actData="karthika";
		Assert.assertTrue(actData.equals(ExpData), "Assert Fail");
		System.out.println("Assert pass");
	}
	@Test
	public void m7() {
		String expdata="karthikA";
		String actdata="karthika";
		Assert.assertTrue(actdata.equals(expdata), "Assert Pass");
		System.out.println("Assert fail");
	}
	
	@Test
	public void m8() {
		String expdata="welcome";
		String actdata="wecome ";
		Assert.assertFalse(actdata.equals(expdata), "Assert fail");
		System.out.println("Assert pass");
	}
	
	@Test
	public void m9() {
		String expdata="welcome";
		String actdata="wecome";
		Assert.assertFalse(actdata.equals(expdata), "Assert pass");
		System.out.println("Assert fail");
	}
	@Test
	public void m10() {
		String s=null;
		Assert.assertNull(s, "Assert fail");
		System.out.println("Assert pass");
	}
	@Test
	public void m11() {
		String s="qspiders";
		Assert.assertNull(s, "Assert fail");
		System.out.println("Assert pass");
	}
	@Test
	public void m12() {
		String s="hello";
		Assert.assertNotNull(s, "Assert fail");
		System.out.println("Assert pass");
	}
	@Test
	public void m13() {
		String s=null;
		Assert.assertNotNull(s, "Assert fail");
		System.out.println("assrt pass");
	}
	@Test
	public void m14() {
		int act=10;
		int exp=20;
		Assert.assertSame(act, exp, "Assert fail");
		System.out.println("Assert pass");
	}
	@Test
	public void m15() {
		int act=10;
		int exp=10;
		Assert.assertSame(act, exp, "Assert pass");
		System.out.println("Assert fail");
	}
	@Test
	public void m16() {
		int act=10;
		int exp=20;
		Assert.assertNotSame(act, exp, "Assert fail");
		System.out.println("Assert pass");
	}
	@Test
	public void m17() {
		int act=10;
		int exp=10;
		Assert.assertNotSame(act, exp, "Assert fail");
		System.out.println("Assert pass");
	}
	
}
