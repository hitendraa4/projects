package stringpractice;

import java.util.TreeMap;

public class FrequencyOfWordsusingMap {

	public static void main(String[] args) {
        String s="Hello India Hello";
        
        String[] words = s.split(" ");
        
        TreeMap<String, Integer> t=new TreeMap<String, Integer>();
       
        
        
        for(int i=0;i<words.length;i++)
        {
        	t.put(words[i], t.getOrDefault(words[i],0)+1);
        }
        System.out.println(t);
	}

}
