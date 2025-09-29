package com.wipro.JUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestCheckPresence {
	@Test
	public void testElePresence() {
		ArrayUtil arrayut = new ArrayUtil();
		
		int[] numbers = {1,2,3,4,5};
		
		assertTrue(arrayut.contains(numbers, 3));
		assertFalse(arrayut.contains(numbers, 10));
	}

}
