package stringpractice;

public class AppEndZero {

	public static void main(String[] args) {
		int [] a= {12,0,13,14,0};
		
		int n=0;
		int l=a.length-1;
		
		int [] b=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[l]=a[i];
				l--;
			}
			else {
				b[n]=a[i];
				n++;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}

	

}
