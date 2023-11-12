package jdbc;

public class AppendAtLastAnArray {

	public static void main(String[] args) {
		int [] a= {0,1,0,1,1};
		int [] b=new int[a.length];
		
		int x=a.length-1;
		int n=0;
		
		
			for(int i=1;i<a.length;i++)
			{
				if(a[i]==0)
				{
					b[x]=a[i];
					x--;
				}
				else
				{
					b[n]=a[i];
					n++;
				}
			}
		
		
		for(int i=0;i<a.length;i++)
		{
		System.out.print(b[i]+" ");
		}
	

}
}
