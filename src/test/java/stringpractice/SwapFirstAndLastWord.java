package stringpractice;

public class SwapFirstAndLastWord {

	public static void main(String[] args) {
		String s="My love India";
		
		String[] w = s.split(" ");
		
		String temp=w[0];
		w[0]=w[w.length-1];
		w[w.length-1]=temp;
		
		
		for(int i=0;i<w.length;i++)
		{
			System.out.print(w[i]+" ");
		}

	}

}
