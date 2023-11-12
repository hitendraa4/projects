package ty1107;

import java.util.Scanner;

public class Pallindrome {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=sc.nextInt();
		
		int rev=0;
		int temp=a;
		while(a!=0)
		{
			int d=a%10;
			rev=rev*10+d;
			a=a/10;
		}
		
		if(rev==temp)
		{
			System.out.println(temp+" is Pallindrome");
		}
		else {
			System.out.println(temp+"is not pallindrome");
		}
	}

}
