package jdbc;

public class ArrayPrime {

	public static void main(String[] args) {
		
		
		
		int [] a= {2,3,4,5,6};
		
		for(int i=0;i<a.length;i++)
		{
			boolean rs=isPrime(a[i]);
			
			
			if(rs)
			{
				System.out.println(a[i]+" isPrime");
			}
			else {
				System.out.println(a[i]+"is not prime");
			}
		}

	}

	private static boolean isPrime(int i) {
		
		
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				return false;
			}
		}
		return true;
	}

}
