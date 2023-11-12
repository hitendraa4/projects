package jdbc;

public class ArrayAdition {

	public static void main(String[] args) {

		
		
		int [] a= {12,13,2,5,6};
		
		int [] b= {5,6,7,8};
		
		int length=a.length;
		
		if(b.length>a.length)
			length=b.length;
		
		
			for(int i=0;i<length;i++)
		
		{
				try{
			System.out.println(a[i]+b[i]+" ");
		}
			
		
		catch(Exception e)
		{
			if(a.length<b.length)
				System.out.println(b[i]);
			else 
				System.out.println(a[i]);
		}
		
		
	}

}
}
