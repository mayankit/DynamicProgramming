package com.mayank.arrays;

import java.util.HashMap;
import java.util.Map;

public class CheckForPairInArrayForX {
/*Write a java program that, given an array A[]
 *  of n numbers and another number x, determines
 *   whether or not there exist two elements in S 
 *   whose sum is exactly x. 
 * 
 * 
 * Solution 1:
 * hasArrayTwoCandidates (A[], ar_size, sum)
1) Sort the array in non-decreasing order.
2) Initialize two index variables to find the candidate 
   elements in the sorted array.
       (a) Initialize first to the leftmost index: l = 0
       (b) Initialize second  the rightmost index:  r = ar_size-1
3) Loop while l < r.
       (a) If (A[l] + A[r] == sum)  then return 1
       (b) Else if( A[l] + A[r] <  sum )  then l++
       (c) Else r--    
4) No candidates in whole array - return 0

second solution below
 */
	private static final int MAX = 100000; //max size of hashMap
	
	public static void main(String[] args) {
		
		int arr[] = {1,4,45,6,10,-8};
		int sum = 16;
		//printPairs(arr,sum);
		anotherSolution(arr,sum);
	}

private static void anotherSolution(int[] arr, int sum) {
    Map<Integer,Integer> map = new HashMap<>();
    
	for(int i=0;i<arr.length;i++){
	  Integer value = 	map.get(arr[i]);
	  
	  if(value == null){
		  map.put(sum-arr[i], arr[i]);
	  }else{
		  System.out.println(arr[i]+","+value);
	  }
	}
		
	}

//This solution will not work in case of negative number better approach is upper one.
private static void printPairs(int[] arr, int sum) {
	boolean[] flagArray = new boolean[MAX];
	for(int i=0;i< arr.length;i++){
		int temp = sum - arr[i];
		if(temp >=0 && flagArray[temp]){
			System.out.println("pairs are"+ arr[i]+","+temp);
		}
		flagArray[arr[i]] = true;
	}
	
}


	
}
