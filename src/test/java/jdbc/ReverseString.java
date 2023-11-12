package jdbc;

public class ReverseString {

	public static void main(String[] args) {
		
	 reverse();

	}
	
	public static void reverse()
	{
		String a="Hello";
		String c="";
		int b=a.length()-1;
		c=c+a.charAt(b);
		b--;
		if(b==0)
		{
			System.out.println(c);
			
			
		}
	
		 reverse();
		
	}

}
