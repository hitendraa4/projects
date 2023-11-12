package string;

public class ReverseWordsInaString {
// very Important
	public static void main(String[] args) {
		String a="My name is Hitendra";
		String[] a1 = a.split(" ");
		
		
		for(int i=0;i<a1.length;i++)
		{
			String h="";
			for(int j=a1[i].length()-1;j>=0;j--)
			{
				h=h+a1[i].charAt(j);
			}
			a1[i]=h;
			System.out.print(a1[i]+" ");
		}
	}
	
	

}
