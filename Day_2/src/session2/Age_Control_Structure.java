package session2;

import java.util.Scanner;

public class Age_Control_Structure {

	public static void main(String[] args) {
		
		System.out.println("Enter your Age : ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age>18)
		{
			System.out.println("You are elegible for Vote");
		}
		else
		{
			System.out.println("You are not elegible for Vote");
		}
		
		
	}
}
