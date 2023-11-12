package jdbc;

public class CombinationOfNo {
	
	
	public static void main(String[] args) {
		
		int [] a= {8,3,5,9,2,0};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==11)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}

}
