package jdbc;

public class Aaabbc {

	public static void main(String[] args) {
     
		String a="aaabbccca";
		
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
				result=result+count+a.charAt(i);
				count=1;
			}
			if(i==a.length()-1)
			{
				result=result+count;
			}
			
		}
		
		System.out.println(result);
		
		
		
		
	}

}
