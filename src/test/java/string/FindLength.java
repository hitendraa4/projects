package string;

public class FindLength {

	public static void main(String[] args) {
      String a="Hello India";
      
      
      int length=0;
      for(int i=0; ;i++)
      {
    	  try {
       	  a.charAt(i);
    	  length++;
    	  }
    	  catch(Exception e)
    	  {
    		  break;
    	  }
    	  
      }
      System.out.println(length);
	}

}
