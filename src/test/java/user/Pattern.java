package user;

public class Pattern {

	public static void main(String[] args) {
    
		
		int sp=0,st=1;
		int n=5;
		
		for (int i = 0; i <=n; i++) {
			{
				for(int j=0;j<=sp;j++)
				{
					System.out.print(" ");
				}
				
				for(int a=1;a<=st;a++)
				{
					System.out.print("*"+" ");
				}
				
				System.out.println();
				if(i<=n)
				{
					sp++;
					st=st+1;
				}
			}
		}
		
		String a="\"yhyhy xcxcd \"xcscsc\"bcnjx\" cxc ununu hybh";
		String[] w = a.split(a);

		for(int i=0;i<=w.length;i++)
		{
			
		}
	}	
		
}
