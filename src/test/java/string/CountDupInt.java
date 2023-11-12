package string;

import java.util.LinkedHashSet;

public class CountDupInt {

	public static void main(String[] args) {
		 int [] a= {12,13,14,15,12,12};
	      
	      
	      LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
	      int count=0;
	      for(int i=0;i<a.length;i++)
	      {
	    	  if (!l.add(a[i]))
	    	  {
	    		  count++;
	    	  }
	      }
	      System.out.println(count);
	}

}
