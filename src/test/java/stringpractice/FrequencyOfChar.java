package stringpractice;

import java.util.LinkedHashSet;

public class FrequencyOfChar {

	public static void main(String[] args) {
		
		
		String a="HelloIndia";
		
		LinkedHashSet<Character> l=new LinkedHashSet<Character>();
	     for(int i=0;i<a.length();i++)
	     {
	    	 l.add(a.charAt(i));
	     }
	     
	     for(Character j:l)
	     {
	    	 int count=0;
	    	 for(int i=0;i<a.length();i++)
	    	 {
	    		 if(j==a.charAt(i))
	    		 {
	    			 count++;
	    		 }
	    	 }
	    	 System.out.println(j+" Frequency->:"+count);
	     }

	}

}
