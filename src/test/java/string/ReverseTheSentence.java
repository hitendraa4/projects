package string;

public class ReverseTheSentence {

	public static void main(String[] args) {
       String a="My name is Hitendra";
       String[] a1 = a.split(" ");
       
       for(int i=a1.length-1;i>=0;i--)
       {
    	   System.out.print(a1[i]+" ");
       }
	}

}
