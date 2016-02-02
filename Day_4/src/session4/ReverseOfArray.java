package session4;

public class ReverseOfArray {

	public static void main(String[] args) {
		
		int arr[] = {34,43,23,23,2323,232,22321,6565,55,575676,77};
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
		System.out.println("Reverse of An Array");
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i] +" ");
		}
	}
}
