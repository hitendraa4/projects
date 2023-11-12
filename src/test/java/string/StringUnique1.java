package string;

public class StringUnique1 {
	
	public static void main(String[] args) {
		
		String a="I am a test Engineer";// r ee n ignE
		
		String[] w = a.split(" ");
		
		int [] count =new int[w.length];
		
		
		for(int i=0;i<w.length;i++)
		{
			count[i]=w[i].length();
		}
		
		
		// 
		String rev="";
		
		for(int i=w.length-1;i>=0;i--)
		{
			rev=rev+w[i];
		}
		
		int num=0;
		for(int i=0;i<count.length;i++)
		{
			
			for(int j=0;j<count[i];j++)
			{
				System.out.print(rev.charAt(num));
				num++;
			}
			System.out.print(" ");
		}
		
	}

}
