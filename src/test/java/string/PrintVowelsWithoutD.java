package string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class PrintVowelsWithoutD {

	public static void main(String[] args) {
		String a="Bangalore";
		
		LinkedHashSet<Character> l=new LinkedHashSet<Character>();
		
		for(int i=0;i<a.length();i++)
		{
			l.add(a.charAt(i));
		}
		ArrayList<Character> a1=new ArrayList<Character>(l);
		int count=0;
		for(Character i:a1)
		{
			if(i=='a'||i=='e'||i=='o'||i=='i'||i=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
		

	}


	
	
	
	
}
