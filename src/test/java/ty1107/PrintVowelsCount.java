package ty1107;

import java.util.*;

public class PrintVowelsCount {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input =sc.next();
		
		String lc = input.toLowerCase();
		
		int count=0;
		
		for (int i = 0; i < lc.length(); i++) {
			
			char ch = lc.charAt(i);
			
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
			
			
			
		}
		System.out.println(input+"-"+count);
		
	}

}
