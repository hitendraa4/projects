package ty1107;

public class Reverseinsameorder {

	public static void main(String[] args) {
	       String a="I am ";// r en i gneera
	       
	       String s=a.toLowerCase();
	       
	       String[] l = a.split(" ");
	       int [] count=new int [l.length];
	       
	       for(int i=0;i<l.length;i++)
	       {
	    	  count[i]=l[i].length();
	    	  System.out.println(count[i]);
	       }
	       
	       
	      String rev="";
	      
	      for(int i=l.length-1;i>=0;i--)
	      {
	    	  rev=rev+l[i];
	      }
	      System.out.println(rev);
	      int num=0;
	      for(int i=0;i<count.length;i++)
	      {
	    	  for(int j=0;j<count[i];j++)
	    	  {
	    		  System.out.print(rev.charAt(num  ));
	    		  num++;
	    	  }
	    	  System.out.print(" ");
	      }
	}

}
