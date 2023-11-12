package ty1107;

import java.util.*;


public class PallindromeStringUsingIterator {

	public static void main(String[] args) {
              String a="malayalam";
              
              
   ArrayList<Character> l=new ArrayList<Character>();
              
          for(char i:a.toCharArray())
              {
            	  l.add(i);
			}
              ListIterator<Character> it = l.listIterator();
              boolean x=false;
              char a2 = 0 ;
              while(it.hasNext())
              {
            	  a2 = (it.next());
              }
              
				while(it.hasPrevious())
					
				{
					 char previous = (it.previous());
					
					if(a2==previous)
					{
						x=true;
					}
				}
              
              if(x)
              {
            	  System.out.println(a+"  is pallindrome");
              }
              
              else {
            	  System.out.println(a+"is not pallindrome");
              }
              
              
            
              
	}

}
