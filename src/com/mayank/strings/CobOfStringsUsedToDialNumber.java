package com.mayank.strings;

import java.util.HashMap;
import java.util.Map;

public class CobOfStringsUsedToDialNumber {
	
	/*
     * All combinations of strings that can be used to dial a number

     * Given a number, print all possible combinations of strings that can be used to dial the given number in a phone with following specifications.

     * In the given phone, we can dial,
     * 2 using A or B or C,
     * 3 using D or E or F,
     * ……………….
     * 8 using T or U or V,
     * 9 using W or X or Y or Z,
     * 1 using only 1
     * using 0.
     * For example if 23, is the given phone number, the program should print AD, AE, AF, BD, BE, BF, CD, CE, CF
	 */
	
	public static void main(String[] args) {
		Map<Character,String> hm = new HashMap<>();
		 hm.put('2', "ABC");
	     hm.put('3', "DEF");
	     hm.put('4', "GHI");
	     hm.put('5', "JKL");
	     hm.put('6', "MNO");
	     hm.put('7', "PQRS");
	     hm.put('8', "TUV");
	     hm.put('9', "WXYZ");
	     hm.put('1', "1");
	     hm.put('0', "0");
		
	     String phone = "23456";
	     
	     StringBuilder sb = new StringBuilder();
	     printStrings(phone,0,hm,sb);
		
	}

	private static void printStrings(String phone, int index, Map<Character, String> hm, StringBuilder sb) {
		if(index == phone.length()){
			System.out.println(sb);
			return;
		}
		
		String str = hm.get(phone.charAt(index));
		for(char ch : str.toCharArray()){
			sb.append(ch);
			printStrings(phone,index+1,hm,sb);
			sb.deleteCharAt(sb.length()-1);
		}
	
		
	}

}
