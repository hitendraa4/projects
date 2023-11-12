package jdbc;

public class ReverseStringWtLoop {

	public static void main(String[] args) {
     
		
		
		
		String a="India";
		int l=(a.length()-1);
		reverse(a,l);
	}

	public static void reverse(String a, int l) {
		
		if(l>=0)
		{
              char ch=a.charAt(l);
              System.out.print(ch);
              reverse(a,l-1);
		}
		
		
	}

}
