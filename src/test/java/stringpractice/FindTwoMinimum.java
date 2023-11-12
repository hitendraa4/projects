package stringpractice;

public class FindTwoMinimum {

	public static void main(String[] args) {
		int [] a= {12,13,14,15,16};
		
		int fmin=a[0];
		int smin=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fmin)
			{
				if(a[i]!=fmin)
				{
					smin=fmin;
				}
				fmin=a[i];
			}
			
			else if(fmin==smin||a[i]<smin)
			{
				smin=a[i];
			}
		}
		System.out.println("first minimum value:"+fmin+"  Second Minimum value"+smin);

	}

}
