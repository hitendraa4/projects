package string;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDupInt {

	public static void main(String[] args) {
      int [] a= {12,13,14,15,12};
      
      
      LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
      
      for(int i=0;i<a.length;i++)
      {
    	  l.add(a[i]);
      }
      
      ArrayList<Integer> n=new ArrayList<Integer>(l);
      int [] b=new int[l.size()];
      
      
      for(int i=0;i<b.length;i++)
      {
    	  b[i]=a[i];
    	  System.out.print(b[i]+
    			  " ");
      }
      
      
      
      
      
	

}
}
