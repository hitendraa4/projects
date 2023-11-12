package string;

import java.util.LinkedHashSet;

public class OccuranceOfEachNo {

	public static void main(String[] args) {
		 int [] a= {12,13,14,15,12};
	      
	     
	      
	      for(int i=0;i<a.length;i++)
	      {
	    	  int count=0;
	    	 for(int j=i;j<a.length;j++)
	    	 {
	    		if(a[i]==a[j])
	    		{
	    			count++;
	    		}
	    	 }
	    	 System.out.println(a[i]+"frequency is:"+count);
	      }
		
		
		
		
	}

}
