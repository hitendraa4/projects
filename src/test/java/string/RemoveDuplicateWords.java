package string;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
     String s="I am a Software Engineer a";
     
     String[] a = s.split(" ");
     
     LinkedHashSet<String>  l=new LinkedHashSet<String>();
     
     for(int i=0;i<a.length;i++)
     {
    	 l.add(a[i]);
    	 
     }
     
     for(String i:l)
     {
    	 System.out.print(i+" ");
     }
     
	}

}
