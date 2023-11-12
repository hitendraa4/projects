package string;

import java.util.LinkedHashSet;

public class OccurenceOfWords {

		public static void main(String[] args) {
		     String s="I am a Software a Engineer a am";
		     
		     String[] a = s.split(" ");
		     
		     LinkedHashSet<String>  l=new LinkedHashSet<String>();
		     for(int i=0;i<a.length;i++)
		     {
		    	 l.add(a[i]);
		     }
		    
		     
		     for(String i:l)
		     {
              int count=0;
              for(int j=0;j<a.length;j++)
              {
            	  if(i.equals(a[j]))
            	  {
            	     count++; 
            	  }
            	 
            	  
              }
              
              System.out.println(i+"frequency:"+count);
		     }
		     
			}
	}


