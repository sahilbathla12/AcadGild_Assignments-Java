package session3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Operations operator = new Operations();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first No ");
		double firstNo= scan.nextDouble();
		System.out.println("Enter Second No ");
		double SecondNo= scan.nextDouble();
		
		System.out.println("Enter operation \n 1. + \n 2. - \n 3. * \n 4. / 5. % \n");
		String Operation = scan.next();
		double result=0;
		switch(Operation)
		{
		
		case "+": result =operator.sum(firstNo,SecondNo);
					break;
		case "-":result = operator.sub(firstNo,SecondNo);
		break;
		case "*": result =operator.mul(firstNo,SecondNo);
		break;
		case "/": result =operator.div(firstNo,SecondNo);
		break;
		case "%":result = operator.mod(firstNo,SecondNo);
		break;
		default:
				System.out.println("Entered Operator is not valid");

			
		}
		
		System.out.println("Result of "+firstNo+" "+Operation+" "+SecondNo+" is : "+result);
		
		
	}
}


class Operations
{
	
	public double sum(double a , double b)
	{
		return a+b;
	}
	
	public double sub(double a , double b)
	{
		return a-b;
	}
	public double mul(double a , double b)
	{
		return a*b;
	}
	
	public double div(double a , double b)
	{
		return a/b;
	}
	public double mod(double a , double b)
	{
		return a%b;
	}
}