package string;

import java.util.LinkedHashSet;

public class NoOfDuplicates {

	
		public static void main(String[] args) {
		     String s="I am a Software Engineer a";
		     
		     String[] a = s.split(" ");
		     
		     LinkedHashSet<String>  l=new LinkedHashSet<String>();
		     int count=0;
		     for(int i=0;i<a.length;i++)
		     {
		    	if( !l.add(a[i]))
		    		{
		    		count++;
		    		}
		    	 
		    	 
		     }
		     System.out.println(count);
		     
		    
			}

	}


