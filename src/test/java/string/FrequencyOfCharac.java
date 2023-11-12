package string;

import java.util.LinkedHashSet;

public class FrequencyOfCharac {

	public static void main(String[] args) {
       String a="Hello";
       
       LinkedHashSet<Character> l=new LinkedHashSet<Character>();
       
       for(int i=0;i<a.length();i++)
       {
    	   l.add(a.charAt(i));
       }
       
       for(Character c:l)
       {
    	   int count=0;
    	   for(int i=0;i<a.length();i++)
    	   {
    		   if(c==a.charAt(i))
    		   {
    			   count++;
    		   }
    			   
    			   
    	   }
    	   System.out.println(c+"Frequwncy is:"+count);
       }
	}

}
