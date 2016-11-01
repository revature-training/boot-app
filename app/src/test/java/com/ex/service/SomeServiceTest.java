package com.ex.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeServiceTest {
	
	@Test
	public void testAdd(){
		int x = 5;
		int y = 2;
		int sum = x + y;
		assertEquals(x + " + " + y + " != " + sum, sum, new SomeService().add(5, 2));
	}
	
}
