package com.nicolatesser.v2.math;

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
		
	
	
	
	public static boolean isPrimeSieveOfErastoshenes(long a)
	{
		boolean[]primeNumbers = new boolean[(int)a+1];
		for (int i=0;i<a+1;i++)
		{
			primeNumbers[i]=true;
		}
		
		for (int i=2;i<=a;i++)
		{
			if (!primeNumbers[i])  continue;
			
			int notPrime=i*2;
			while (notPrime<=a)
			{
				primeNumbers[notPrime]=false;
				notPrime=notPrime+i;
			}
			
		}
		
		
		
		return primeNumbers[(int)a];
	}

	
	
}
