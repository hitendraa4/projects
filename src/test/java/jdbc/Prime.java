package jdbc;

public class Prime {

	public static void main(String[] args) {
		int n=9;
		boolean isPrime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not Prime");
				isPrime=false;
			}
			
		}
		if(isPrime)
		{
			System.out.println("Prime");
		}
		

	}

}
