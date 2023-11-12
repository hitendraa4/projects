package ty1107;

public class Stringa {

	public static void main(String[] args) {
		
		String a="aaabbcdddf";//a3b2cd3f
		
		String result="";
		int count=0;
		
		for(int i=0;i<a.length();i++)
		{
			if(i==0)
			{
				result=result+a.charAt(0);
				count++;
			}
			 if(i!=0&&(a.charAt(i)==a.charAt(i-1)))
			{
				count++;
			}
			 else if(i!=0&&(a.charAt(i)!=a.charAt(i-1)))
			 {
				 
				 if(count==1)
				 {
				 result=result+a.charAt(i);
				 }
				 else {
					 result=result+count+a.charAt(i);
					 count=1;
					 
				 }
				
				 
			 }
			 
			
			
		}
		
		System.out.println(result);
		
		

	}

}
