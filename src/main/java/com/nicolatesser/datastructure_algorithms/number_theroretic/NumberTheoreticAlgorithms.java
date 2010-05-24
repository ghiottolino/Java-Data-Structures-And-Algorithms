package com.nicolatesser.datastructure_algorithms.number_theroretic;

public class NumberTheoreticAlgorithms {

	public static boolean isPrime(long a)
	{
		long sqrtA = (long) Math.floor(Math.sqrt(a));
		
		if ((a % 2)==0) return false;
		
		for (int i=3;i<=sqrtA;i=i+2)
		{
			if ((a % i)==0) return false;
		}
		return true;
		
	}
	
	public static boolean isPseudoPrime(long a)
	{
		long pow = (long)Math.pow(2, a-1);
		long rem = pow % a ;
		
		if (rem == 1)
			return true;
		else
			return false;
		
	}
	
	//gcd
	//there is an algorithm (maybe euclide) that recoursively look for the mod of a division
	// gcd (a,b)
	// gcd (b,a % b)
	// ...
	//till x % y == 0 , then y is the gcd.
	
}
