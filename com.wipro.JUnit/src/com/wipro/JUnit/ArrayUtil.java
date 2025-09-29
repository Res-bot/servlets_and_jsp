package com.wipro.JUnit;

public class ArrayUtil {
	
	public boolean contains(int arr[], int ele) {
		for(int num: arr) {
			if(num == ele) {
				return true;
			}
			
		}
		return false;
	}

}
