package string;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f1=0;
		
		int f2=1;
		
		int n=5;
		
		while(f1<=n)
		{
			System.out.println(f1+" ");
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			
		}

	}

}
