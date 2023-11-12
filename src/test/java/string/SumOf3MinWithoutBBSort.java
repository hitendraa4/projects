package string;

public class SumOf3MinWithoutBBSort {

	public static void main(String[] args) {
         int [] a= {17,13,14,15,16};
         
         
         int fmin=99;
         int smin=99;
         int tmin=99;
         
         System.out.println(fmin+""+smin+" "+tmin);
         
         for(int i=0;i<a.length;i++)
         {
        	 if(a[i]<fmin)
        	 {
        		 tmin=smin;
        		 smin=fmin;
        		 fmin=a[i];
        		 
        	 }
        	 else if(a[i]<smin)
        	 {
        		 tmin=smin;
        		 smin=a[i];
        		 
        		 
        	 }
        	 
        	 else if(a[i]<tmin)
        	 {
        		tmin=a[i];
        		
       	 }
        	 
        	 
        		 
        		 
         }
         System.out.println(fmin+" "+smin+" "+tmin);
	}

}
