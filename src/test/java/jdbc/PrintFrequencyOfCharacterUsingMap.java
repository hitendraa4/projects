package jdbc;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintFrequencyOfCharacterUsingMap {

	public static void main(String[] args) {
		String s="testyantra";
		
		LinkedHashMap<Character, Integer> l=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			l.put(s.charAt(i), i);
		}
		
		
		for( Entry<Character, Integer> i:l.entrySet())
		{
			int count=0;
			for(int a=0;a<s.length();a++)
			{
				if(i.getKey()==s.charAt(a))
				{
					count++;
				}
			}
			if(count>1)
			System.out.println(i.getKey()+"repeating "+count+"times");
		}


	}

}
