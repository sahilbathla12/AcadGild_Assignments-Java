package session3;

import java.util.Scanner;

public class PrimeNo_usingObjects {

	public static void main(String[] args) {
	
		PrimeNo_usingObjects primeObject = new PrimeNo_usingObjects();
		System.out.println("Enter a  no to check it is prime or not ");
		Scanner scan = new Scanner(System.in);
		int no= scan.nextInt();
		
		
		if (primeObject.isPrime(no)) {
			System.out.println("no is Prime");
			
		}
		else
		{
			System.out.println("no is not Prime");
			
		}
	}
	
	public boolean isPrime(int no)
	{

		
				boolean isPrime=true;
				for(int j=2;j<no;j++)
				{
					if(no%j==0)
					{
						isPrime=false;
						break;
					}
				}
				return isPrime;
		
	}
}
