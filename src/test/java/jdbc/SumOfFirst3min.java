package jdbc;

public class SumOfFirst3min {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,60};
		
		
		
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=0+i;j<a.length;j++)
	    	{
	    		if(a[i]>a[j])
	    		{
	    			int temp=a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    		}

	    	}
	    }
	    
	    int sum=0;
	    
	    for(int i=0;i<a.length-2;i++)
	    {
	    	sum=sum+a[i];
	    	
	    	
	    }
	    
	    System.out.println(sum);
		
		

	}

}
