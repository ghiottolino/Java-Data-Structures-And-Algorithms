package com.nicolatesser.v2.stringproblems;

import java.util.HashMap;
import java.util.Map;

public class StringManipulationAlgorithms {
	
	//--> O(n)
	public static char firstNotRepeatedCharacterV1(String input)
	{
		//count how many occurency of a char are present in the input string, store in an array with index the char --> O(n)
		
		//int a = (char)'a'; //97
		//int z = (char)'z'; //122
		
		
		int charFrequencies[]= new int[25];
		for (int i=0;i<input.length();i++)
		{
			int c = input.charAt(i)-97;
			charFrequencies[c]++;
		}
		
		
		// cycle again, and look for the first with frequency 1   --> O(n)
		for (int i=0;i<input.length();i++)
		{
			int c = input.charAt(i)-97;
			if (charFrequencies[c]==1)
			{
				return input.charAt(i);
			}
		}
		
		return 0;
	}
	
	public static char firstNotRepeatedCharacter(String input)
	{
		//count how many occurency of a char are present in the input string, store in an array with index the char --> O(n)
		
		//int a = (char)'a'; //97
		//int z = (char)'z'; //122
		
				
		Map<Integer,Integer> charFrequencies =  new HashMap<Integer,Integer>();
		for (int i=0;i<input.length();)
		{
			int codePointAt = input.codePointAt(i);
			i += Character.charCount(codePointAt);
			
			Integer f = charFrequencies.get(codePointAt);
			if (f==null)
			{
				f=Integer.valueOf(1);
			}
			else f++;
			charFrequencies.put(codePointAt, f);
		}
		
		
		// cycle again, and look for the first with frequency 1   --> O(n)
		for (int i=0;i<input.length();)
		{
			int codePointAt = input.codePointAt(i);
			i += Character.charCount(codePointAt);
			
			if (charFrequencies.get(codePointAt)==1)
			{
				return Character.toChars(codePointAt)[0];
			}
		}
		
		return 0;
	}
	
	

}
