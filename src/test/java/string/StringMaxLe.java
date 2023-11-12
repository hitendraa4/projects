package string;

public class StringMaxLe {

	public static void main(String[] args) {
	String [] a= {"ab","abcd","abcdefgh", "a"};
		
		
		int maxl=a[0].length();
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i].length()>maxl)
			{
				maxl=a[i].length();
			}
			
		}
		
System.out.println(maxl);

for(int i=1;i<a.length;i++)
{
	if(maxl==a[i].length())
	{
		System.out.println(a[i]+"  index:"+i);
	}
}

	}

	}


