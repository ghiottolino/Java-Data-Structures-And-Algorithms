package com.nicolatesser.v2.ctci.chapter1;

import java.util.HashMap;
import java.util.Map;

public class ArrayAndStringsAlgorithms {
	
	public static boolean hasAllUniqueChars(String s){
		
		Map<Character,Boolean> containedChars = new HashMap<Character, Boolean>();
		
		for (int i=0;i<s.length();i++){
			
			char c = s.charAt(i);
			if (containedChars.get(c)==null) containedChars.put(c, true); else return false;
			
		}	
		return true;
	}
	
	
	
	/**
	 * This algorithms is just wrong...I made it under the assumption that the string is bigger than the space of characters, but under this assumption I could simply return false -.-.
	 * Just typing it to check if I am able to write on paper without many mistakes.
	 * @param s
	 * @return
	 */
	public static boolean hasAllUniqueCharsInPlace(String s){
		int n = s.length();
		int i=0;
		while (i<n){
			char c =s.charAt(i);
			int hashIndex = (int)c%n;
			char hashIndexChar = s.charAt(hashIndex);
			if (i==hashIndex)i++;
			else if (c==hashIndexChar) return false;
			else{
//				char t= hashIndexChar;
//				hashIndexChar=c;
//				c=t;
				
				//
				s= s.substring(0,hashIndex)+c+s.substring(hashIndex+1);
				s= s.substring(0,i)+hashIndexChar+s.substring(i+1);

			}
		
			
			
		}
		
		
		return true;
	}
	
	
	
	/**
	 * ERRORS:
	 * 
	 * 1) Map and Hashmaps want to have the big object, not the primitive type -.-
	 * 2) Big type for char is Character not Char
	 * 3) String.length() is a function, not a member variable +1
	 * 4) Forgot to use get for retrieving an obj from hashmap. writing and retrieving could be done with primitive types.
	 * 5) Always use semi-colon after the if condition (before the else) +2
	 * 6) Replacing a given char in a string with a index cannot done through referiments (a new String must be created).
	 */
	
}
