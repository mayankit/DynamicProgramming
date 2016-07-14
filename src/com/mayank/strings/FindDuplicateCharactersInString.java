package com.mayank.strings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindDuplicateCharactersInString {
	
	public static void main(String[] args) {
		printDuplicateCharacters("Programming");
	}

	private static void printDuplicateCharacters(String string) {
		Set<Character> charSet = new HashSet<>();
		Set<Character> repeaterSet = new HashSet<>();
		for(char ch : string.toCharArray()){
			boolean isRepeating = charSet.add(ch);
			if(!isRepeating){
				repeaterSet.add(ch);
			}
		}
		
		Iterator<Character> iterator = repeaterSet.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() +" ");
		}
		
	}

}
