package session2;

import java.util.Scanner;

public class NoofDaysinGivenMonth {

	public static void main(String[] args) {
		
		System.out.println("Enter Month name ");
		Scanner scan = new Scanner(System.in);
		String month= scan.next();
		
		
		switch(month)
		{
			case "January":
			case "May":
			case "March":
			case "July":
			case "August":
			case "December":
			case "October":
							System.out.println("31");
							break;
			case "April":
			case "June":
			case "September":
			case "November":
							System.out.println("30");
							break;
			case "February":
							System.out.println("28 or 29");
							break;
			default:
					System.out.println("Enter exact month name");
					break;
		}
	}
}
