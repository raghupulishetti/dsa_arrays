package com.raghu.dsa.arrays;

import java.util.HashSet;
import java.util.Set;

//Return first repeated number in array.
//If all are distinct then return -1
public class FirstRepeatedNumber {

	public static void main(String[] args) {
		int[] nums = { 10, 4, 5, 4, 23, 34, 56 };
		System.out.println("First repeated number is: " + firstRepeated(nums));

	}
// time complexicity O(n) space complexicity O(n)
	public static int firstRepeated(int[] nums) {
		int repeated = -1;
		Set<Integer> set = new HashSet<>();
		for(int i:nums) {
			if(!set.add(i)) {
				return i;
			}
		}
		
		return repeated;
	}

}
