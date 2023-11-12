package ty1107;

import java.util.ArrayList;
import java.util.Collections;

public class FirstTwoMax {

	public static void main(String[] args) {
		
		firstTwoM();
	}
	
	public static void firstTwoM()
	{
		ArrayList< Integer> l=new ArrayList<Integer>();
		l.add(12);
		l.add(16);
		l.add(15);
		l.add(14);
		
		
		Collections.sort(l);
		
		System.out.println(l.get(l.size()-1));
		System.out.println(l.get(l.size()-2));
		
		
	}

}
