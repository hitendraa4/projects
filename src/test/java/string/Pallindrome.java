package string;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
      
		for(; ;)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String a=sc.next();
			
			String rev="";
			
			for(int i=a.length()-1;i>=0;i--)
			{
				rev=rev+a.charAt(i);
			}
			
			if(rev.equals(a))
			{
				System.out.println("Pallindromic string");
			}
			else
			{
				System.out.println("String is not pallindromic");
			}
		}
		
		
		
	}

}
