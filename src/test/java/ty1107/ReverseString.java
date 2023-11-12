package ty1107;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s="wlecome to expleo";
		
		String[] s1 = s.split(" ");
		
		String rev="";
		
		for(int i=s1.length-1;i>=0;i--)
		{
			rev=rev+s1[i]+" ";
		}
		
		System.out.println(rev);
		
		
	}

}
