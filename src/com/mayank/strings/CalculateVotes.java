package com.mayank.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CalculateVotes {
	/* In this problem we have array with strings contaiing votes of a member.In below exxample as B comes
	 * Two times so its votes count is 2
	 * Now  if two peoples have same vote count then the member with decreasing order of name is winner
	 * here both A & E have vote count 3 but winner is E
	 * 
	 */
	public static void main(String[] args) {
		
		String[] stringArray = {"A","B","C","B","A","D","D","E","E","A","C","E"};
		System.out.println(calculateWinner(stringArray));
	}

	private static String calculateWinner(String[] stringArray) {
		Map<String,Integer> map = new HashMap<>();
		
		for(String str : stringArray){
			Integer oldCount = map.get(str);
			if(oldCount == null){
				map.put(str, 1);
			}else{
				map.put(str, oldCount+1);
			}
			
		}
		
		    Set<Entry<String, Integer>> set = map.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
	        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
	        {
	            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
	            {
	                int value = (o2.getValue()).compareTo( o1.getValue() );
	                if(value != 0){
	                	return value;
	                }
	                
	                return  o2.getKey().compareTo(o1.getKey());
	            }
	        } );
	        
	        return list.get(0).getKey();
	}
	

}
