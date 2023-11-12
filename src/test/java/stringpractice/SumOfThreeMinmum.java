package stringpractice;

public class SumOfThreeMinmum {

	public static void main(String[] args) {
		int [] a= {12,13,14,15};
		
		int fmin=99;
		int smin=99;
		int tmin=99;
      
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fmin)
			{
				tmin=smin;
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin)
			{
				tmin=smin;
				smin=a[i];
			}
			else if(a[i]<tmin)
			{
				tmin=a[i];
			}
		}
		
		System.out.println("sum of three min:"+(fmin+smin+tmin));
		

	}

}
