package com.wipro.JUnit;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SortUtilTest {
	@Test
	public void testSortedValues() {
		SortUtil sort = new SortUtil();
		
		int[] input = {5,2,8,1,3};
		int[] expected = {1,2,3,5,8};
		
		int[] result = sort.sortValues(expected);
		
		assertArrayEquals(expected, result);
	}
	
}
