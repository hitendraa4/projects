package ty1107;

public class RotationOfArray {

	public static void main(String[] args) {
	
		
		int [] a= {12,13,14,15};// shift the array    13,14,,15,16 
		
		int run=2;
		
		for(int i=0;i<run;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				try {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
				catch(Exception e)
				{
					
				}
				
				
			}
		}
		
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
		

	}

}
