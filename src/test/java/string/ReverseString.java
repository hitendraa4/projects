package string;

public class ReverseString {
	public static void main(String[] args) {
		
		
		String a="Hitendra";
		
		char ch[]=a.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
			
	
	
	StringBuilder sb=new StringBuilder("Hitendra");
	      
	  sb.reverse();
	  System.out.println(  sb.reverse());
	  
	}

}
