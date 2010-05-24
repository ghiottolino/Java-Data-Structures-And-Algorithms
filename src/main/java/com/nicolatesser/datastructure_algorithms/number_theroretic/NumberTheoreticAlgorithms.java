package com.nicolatesser.datastructure_algorithms.number_theroretic;

public class NumberTheoreticAlgorithms {

	public static boolean isPrime(long a)
	{
		long sqrtA = (long) Math.floor(Math.sqrt(a));
		
		for (int i=2;i<=sqrtA;i++)
		{
			if ((a % i)==0) return false;
		}
		return true;
		
	}
	
	//gcd
	//there is an algorithm (maybe euclide) that recoursively look for the mod of a division
	// gcd (a,b)
	// gcd (b,a % b)
	// ...
	//till x % y == 0 , then y is the gcd.
	
}
