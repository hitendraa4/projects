package string;


public class SwapfirstAndLastWord {

	public static void main(String[] args) {
		String a="My name is Hitendra";
		String[] a1 = a.split(" ");
		
		String temp=a1[0];
		a1[0]=a1[a1.length-1];
		a1[a1.length-1]=temp;
		
		
		String x="";
		for(int i=0;i<a1.length;i++)
		{
		    x+=a1[i]+" ";
		
		}
		
		System.out.println(x);
	}

}
