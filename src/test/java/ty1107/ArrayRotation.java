package ty1107;

public class ArrayRotation {

	public static void main(String[] args) {
           
		
		
		
		int [] a= {12,13,4,54};
		
		int [] a1= {14,13,4,54};
		
		
		String s="";
            
            for(int i=0;i<a.length;i++)
            {
            	int sum=a[i]+a1[i];
            	s=s+sum;
            }
            
            for(int i=0;i<s.length();i++)
            {
            	if(i==s.length()-1)
            		
            	{
            		System.out.print(s.charAt(i));
            	}
            	else {
            		System.out.print(s.charAt(i)+",");
            	}
            	
            	
            }
            
            
            
            
	}

}
