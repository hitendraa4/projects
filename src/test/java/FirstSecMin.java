
public class FirstSecMin {

	public static void main(String[] args) {
		 int [] a= {12,13,14,15,16,2};
		 
		 
		
		 int fmin=a[0];
		 int smin=a[0];
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]<fmin)
			 {
				 smin=fmin;
				 fmin=a[i];
			 }
			 else if(a[i]<smin||smin==fmin)
			 {
				
				smin=a[i]; 
			 }
		 }
		 System.out.println("first minimum"+fmin);
		 System.out.println("second"+smin);
		 
	}

}
