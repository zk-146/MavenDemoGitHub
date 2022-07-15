package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class CalculatorTest {
	Calculator c = new Calculator();

	@Disabled
	@Test
	public void testAdd() {
		int r = c.add(100, 200);
		Assertions.assertEquals(100, r, " Checked add method");
	}

	@Disabled
	@Test
	public void testAssertFalse() {
		Assertions.assertEquals("Hello", "Hello"); // true
		Assertions.assertFalse("Vaibhav".length() == 3);
		Assertions.assertFalse(10 < 20, "10 is not greater than 20");
	}

	@Disabled
	@Test
	public void testAssertNull() {
		String str1 = null;
		String str2 = "abc";
		Assertions.assertNull(str1);
		Assertions.assertNull(str2);
	}

//	@Disabled
	@Test
	public void testArrayList() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Assertions.assertEquals(0, myList.size());
		Assertions.assertTrue(myList.isEmpty());
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2, myList.size());
		
	}

}
