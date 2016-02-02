package session3;

import java.util.Scanner;

public class SquareCubeRootOfNo {

	public static void main(String[] args) {
		
		System.out.println("Enter a No");
		Scanner scan = new Scanner(System.in);
		double no= scan.nextDouble();
		
		System.out.println("Square root of "+no+" is "+Math.sqrt(no));
		System.out.println("Cube root of "+no+" is "+Math.cbrt(no));
	}
}
