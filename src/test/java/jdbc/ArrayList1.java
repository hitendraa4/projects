package jdbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Stack;

public class ArrayList1 {

	public static void main(String[] args) {
    
		 ArrayList<Object> list = new  ArrayList<Object>();
		 
		 list.add("Hello");
		 list.add("Hello");
		 list.add(12.3);
		 list.add(12);
		 list.add(null);
		 list.add(null);
		 
		 System.out.println(list);
		 
		 ArrayList<Integer> a=new ArrayList<Integer>();
		 
		 a.add(12);
		 a.add(13);
		 a.add(15);
		 a.add(80);
		 a.add(8);
		 
		 Collections.sort(a);
		 
		 Stack<Object> s =new Stack<Object>();
		 s.push("Hello");
		 s.push("Hello");
		 s.push(123);
		 s.push(12.0);
		 System.out.println(s.pop());
		 System.out.println(s.pop());
		 System.out.println(s.pop());
		 
		 Hashtable<Integer, String> h=new Hashtable<Integer, String>();
//		 h.put(1, "Rahul");
//		 h.put(2, "abishek");
//		 h.put(3, "Tilak");
//		 h.put(1, "Rahul");
//		 h.put(1, "Rahul");
//		 h.put(4, "abishek");
		 
		 h.put(4, null);
		 
		 
		 
		 System.out.println(h);
		 
		 
	}

}
