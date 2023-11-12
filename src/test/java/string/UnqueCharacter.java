package string;

import java.util.LinkedHashSet;

// very important question

public class UnqueCharacter {

	public static void main(String[] args) {
          String a="Tester";
          
          String s=a.toLowerCase();
          
          LinkedHashSet<Character> h= new LinkedHashSet<Character>();
          
          for(int i=0;i<s.length();i++)
          {
        	  h.add(s.charAt(i));
        	 
          }
          System.out.println(h);
          
          for(Character i:h)
          {
        	  int count =0;
        	  for(int j=0;j<s.length();j++)
        	  {
        		  if(i==s.charAt(j))
        		  {
        			  count++;
        		  }
        		 
        	  }
        	  
        	 
        	  if(count>1)
        	  {
        		  System.out.println(i+"is repeating "+count);
        	  }
          }
	}

}
