package mock;

public class Stringsplit {

	public static void main(String[] args) {
     
		
		
		String a="HiByHiByHiBy";
		int count=0;
		
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='H'&&a.charAt(i+1)=='i')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
