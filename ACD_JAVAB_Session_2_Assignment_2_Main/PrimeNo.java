package session2;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Printing Prime No between 1 to 100");
		
		
		for(int i=1;i<=100;i++)
		{
				boolean isPrime=true;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						isPrime=false;
						break;
					}
				}
				
				if(isPrime)
				{
					System.out.print(i+"\t");
				}
				
			
		}
	}

}
