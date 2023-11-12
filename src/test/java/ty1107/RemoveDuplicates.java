package ty1107;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String a="India";
		a=a.toLowerCase();
		
		LinkedHashSet<Character> l=new LinkedHashSet<Character>();
		
		for(int i=0;i<a.length();i++)
		{
			l.add(a.charAt(i));
		}
		
		for(Character i:l)
		{
			System.out.print(i);
		}
			

	}

}
