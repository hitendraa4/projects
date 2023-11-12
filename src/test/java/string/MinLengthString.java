package string;

public class MinLengthString {

	public static void main(String[] args) {
	
		
		String [] a= {"ab","abcd","abcdefgh", "a"};
		
		
		int minl=a[0].length();
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i].length()<minl)
			{
				minl=a[i].length();
			}
		}
		
System.out.println(minl);
	}

}
