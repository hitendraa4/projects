package string;

public class RemoveSpace {

	public static void main(String[] args) {
        String s="I am Software";
        
        String a1=s.replace(" ", ":");
        System.out.println(a1);
        
        
        String[] a = s.split(" ");
        
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+"");
        }
	}

}
