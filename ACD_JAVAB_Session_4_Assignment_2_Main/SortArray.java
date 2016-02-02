package session4;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = {23,53,21,76,232,4,32,7,24,6,34};
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" \t");
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			for (int j = i+1; j <=arr.length-1; j++) {
				if(arr[i]>arr[j])
			{
					int temp;
					temp =arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
					
				}
			}
		System.out.println();
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+"\t");
		}
		}
		
			
		System.out.println("Sorted Arrray is ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+"\t");
		}
		
		
		System.out.println("\nInsert an Element inside an array");
		
		Scanner scan = new Scanner(System.in);
		
		int no =scan.nextInt();
		int newArray[] = new int[arr.length+1];
		
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(no>arr[i])
				count++;
		}
		int k=0;
		for (int i = 0; i < arr.length; i++) {
				if(i<count)
				{
					newArray[k]=arr[i];
				}
				else if(count==i)
				{
					newArray[k] = no;
					newArray[k+1]=arr[i];
				}
				else
				{
					newArray[k+1]=arr[i];
				}
				k++;
				
				
		}
		arr=newArray;
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+"\t");
		}
				
	}
}
