package stringpractice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ujetix.genericutilities.ListnerImplementation.class)

public class AddTwoArrayDiffrentLength {

	
	@Test
	public  void test1() {
     int [] a= {12,13,14};
     int [] b= {1,2,3,4,5};
     
     int length=a.length;
     if(b.length>length)
     {
    	 length=b.length;
     }
     
     for(int i=0;i<length;i++)
     {
    	 try {
    	 System.out.print((a[i]+b[i])+" ");
    	 }
    	 catch(Exception e)
    	 {
    		 if(a.length>b.length)
    		 {
    			 System.out.print(a[i]+" ");
    		 }
    		 else
    		 {
    			 System.out.print(b[i]+" ");
    		 }
    	 }
     }
	}

}
