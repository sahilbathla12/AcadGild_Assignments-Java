package session3;

import java.util.Scanner;

public class GenerateRandomNo {

	public static void main(String[] args) {
		System.out.println("Enter a  no ");
		Scanner scan = new Scanner(System.in);
		int no= scan.nextInt();
		GenerateRandomNo randomNoObject = new GenerateRandomNo();

		System.out.println(randomNoObject.generateRandomNo(no));
		
	
	}
	
	public int generateRandomNo(int n)
	{
		return (int) (Math.random()*n);
		
	}
}
