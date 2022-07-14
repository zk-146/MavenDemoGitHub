package com.lti.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.lti.entity.Calculator;

class ParamTests {
	@Disabled
	@ParameterizedTest
	@ValueSource(ints = { 8, 10, 20, 50, 100 })
	public void testArrays(int arg) {
		System.out.println(" arg: " + arg);
		Assertions.assertTrue((arg % 2 == 0));
	}

	@ParameterizedTest(name = "#{index} - testing argument = {0}")
	@DisplayName("Should pass all non-null arguments to method")
	@ValueSource(strings = { "Hello", "World", "Hello World", "Hi", "Hello GET1024" })
	public void testParam(String msg) {
		String searchKey = "Hello";
		Assertions.assertTrue(msg.contains(searchKey));
	}

	@RepeatedTest(3)
	public void shouldRepeat() {
		int x = 10, y = 20;

		assertEquals(200, x * y);
	}

	@Test
	public void testLambda() {
		Integer[] intArray = { 2, 3, 7, 5, 10 };
		List<Integer> number = Arrays.asList(intArray);
		Assertions.assertAll(() -> assertEquals(2, number.get(0)), () -> assertEquals(3, number.get(1)),
				() -> assertEquals(7, number.get(2)), () -> assertEquals(5, number.get(3)),
				() -> assertEquals(10, number.get(4)));
	}

	@Test
	void testExceptions() {
		Assertions.assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("100");
		});
	}

	@Test
	void testException1() {

		Calculator c = new Calculator();

		final Exception e = assertThrows(ArithmeticException.class, () -> {
			c.searchEmpId(0);
		});

		Assertions.assertEquals("u enetered zero", e.getMessage());
	}
}
