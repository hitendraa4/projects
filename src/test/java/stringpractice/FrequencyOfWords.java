package stringpractice;

import java.util.LinkedHashSet;

public class FrequencyOfWords {

	public static void main(String[] args) {
		String w="I love my india my";
		
		LinkedHashSet<String> l=new LinkedHashSet<String>();
		
	String[] words = w.split(" ");
	
	for(int i=0;i<words.length;i++)
	{
		l.add(words[i]);
	}
       for(String i:l)
       {
    	   int count=0;
    	   
    	   for(int j=0;j<words.length;j++)
    	   {
    		   if(i.equals(words[j]))
    		   {
    			   count++;
    		   }
    		   
    		   
    		   
    	   }
    	   System.out.println(i+" Frequency is: "+count);
       }
	
	
	
	}

}
