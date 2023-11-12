package string;

import java.util.LinkedHashSet;

public class PositionOfWordsWithtdup {

		public static void main(String[] args) {
		     String s="I am a Software a Engineer a";
		     
		     String[] a = s.split(" ");
		     
		     LinkedHashSet<String>  l=new LinkedHashSet<String>();
		     
		    for(int i=0;i<a.length;i++)
		    {
		    	l.add(a[i]);
		    }
		     
		     for(String i:l)
		     {
             
             for(int j=0;j<a.length;j++)
             {
           	  if(i==a[j])
           	  {
           	     System.out.println(i+"position"+(j+1));
           	     break;
           	  }
           	 
           	  
             }
             
            
		     }
		     
			}

	}


