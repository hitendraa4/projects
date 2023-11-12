package stringpractice;

public class FrequencyOfcharacterRaghu {

	public static void main(String[] args) {
     String s="Hello my name is";
     
     boolean[] a=new boolean[s.length()];
     
     for(int i=0;i<a.length;i++)
     {
    	 
    	 if(a[i]==false)
    	 {
    		 int count=1;
    	 
    	 
    		for(int j=i+1;j<s.length();j++)
    		{
    			if(s.charAt(i)==s.charAt(j))
    			{
    				count++;
    				a[i]=true;
    				
    			}
    		}
    		if(count>1)
    		{
    			System.out.println(s.charAt(i)+"frequency is"+count);
    		}
    	 }
     }
     
	}

}
