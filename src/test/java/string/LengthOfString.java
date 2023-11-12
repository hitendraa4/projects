package string;

public class LengthOfString {

	public static void main(String[] args) {
       String a="Hello how are you";
       
      // char[] ch = a.toCharArray();
       
       int count=0;
      
       for(int i=0; ;i++)
       {
    	   try {
          a.charAt(i);
    	  count++; 
       
    	   }
       catch(Exception e)
       {
    	   break;
       }
       
       
		
	}
       System.out.println(count);

}
}
