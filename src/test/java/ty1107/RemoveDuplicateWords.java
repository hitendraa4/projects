package ty1107;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String a="Hello how are you hello";
		
		String[] w = a.split(" ");
		
		LinkedHashSet< String> l=new LinkedHashSet<String>();
		
		for(int i=0;i<w.length;i++)
		{
			l.add(w[i]);
		}
		
		String b="";
		for(String i:l)
		{
			b=b+i;
		}
    System.out.println(b);
	}

}
