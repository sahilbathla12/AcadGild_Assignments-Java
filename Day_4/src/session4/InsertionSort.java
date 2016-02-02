package session4;

public class InsertionSort {

	
	public static void main(String[] args) {
		int arr[] = {23,53,21,76,232,4,32,7,24,6,34};
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" \t");
		}
		int loop=0;
		
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
					loop++;
				}
			System.out.println();
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]+"\t");
			}
		}
		
		/// Insersion Sort
		
//		int loop=0;
//		for (int i = 1; i < arr.length; i++) {
//			
//			for (int j = i; j >0; j--) {
//				if(arr[j] < arr[j-1])
//				{
//					int temp = arr[j];
//					arr[j]= arr[j-1];
//					arr[j-1]=temp;
//				}
//				loop++;
//			}
//			System.out.println();
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[j]+" \t");
//			}
//		}
//		
		
		
		// Selection Sort
		
//		int loop=0;
//		for(int i=0;i<arr.length-1;i++)
//		{
//			
//			int smallestNo = i;
//				for (int j = i+1; j < arr.length; j++) {
//					if(arr[j]<arr[smallestNo])
//					{
//						smallestNo = j;
//					}
//					loop++;
//				}
//				
//
//				int temp;
//				temp =arr[i];
//				arr[i]=arr[smallestNo];
//				arr[smallestNo] = temp;
//			System.out.println();
//				for (int j = 0; j < arr.length; j++) {
//					System.out.print(arr[j]+"\t");
//				}
//		}
	System.out.println("loop is : "+loop);
		System.out.println();
	for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" \t");
		}
		
	}
}
