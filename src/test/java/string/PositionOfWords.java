package string;


public class PositionOfWords {

	public static void main(String[] args) {
	     String s="I am a Software Engineer a";
	     
	     String[] a = s.split(" ");
	     
	     for(int i=0;i<a.length;i++)
	     {
	    	
	    	 System.out.println(a[i]+" position:"+(i+1));
	    	 
	     }
	     
	     
	    
		}
}
