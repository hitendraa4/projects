package jdbc;

public class FirstMax {

	public static void main(String[] args) {
     int [] a= {12,13,14,15,16};
     
     int max=a[0];
     
     for(int i=1;i<a.length;i++)
     {
    	 if (a[i]>max)
    	 {
    		 max=a[i];
    	 }
     }
     System.out.println(max);
	}

}
