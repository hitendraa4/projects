package string;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class PosnOfIntArEle {

	public static void main(String[] args) {
		
		int [] a={12,13,14,15,12};
		LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
	      {
	    	  l.add(a[i]);
	      }
	      ArrayList<Integer> a1=new ArrayList<Integer>(l);
	      
	      for(int i=0;i<a1.size();i++)
	      {
	    	  for(int j=i;j<a.length;j++)
	    	  {
	    		  if(a1.get(i)==a[j])
	    		  {
	    			  System.out.println("position of "+a1.get(i)+"is"+j);
	    			  
	    		  }
	    	  }
	      }
	      

	}

}
