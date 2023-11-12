package string;

import java.util.LinkedHashSet;

public class PrintPositionOfCharacterWithDuplicates {

	public static void main(String[] args) {
          String a="Tester";
          String s=a.toLowerCase();
          
          LinkedHashSet<Character> l=new LinkedHashSet<Character>();
          
          for(int i=0;i<s.length();i++)
          {
        	  l.add(s.charAt(i));
          }
          // with duplicates
          for(int i=0;i<s.length();i++)
          {
        	  System.out.println(s.charAt(i)+"position "+(i+1));
          }
          
          // without duplicates
          for(Character a1:l)
          {
        	  for(int i=s.length()-1;i>=0;i--)
        	  {
        		  if(a1==s.charAt(i))
        		  {
        			  System.out.println(a1+"="+(i+1));
        			  break;
        		  }
        	  }
          }
          
          
	}

}
