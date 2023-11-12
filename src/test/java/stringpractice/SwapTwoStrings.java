package stringpractice;

public class SwapTwoStrings {
	
	public static void main(String[] args) {
		
		String a="Hello";
		String b="India";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		System.out.println(b);
		a=a.substring(b.length());
		System.out.println(a);
	}

}
