package Samples;

import java.util.List;
import java.util.ArrayList;

public class Sample1 {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("abc");
//		list.add(new Integer(5));
		
		for (Object current: list) {
//			String str = (String)current;
			System.out.println(current);
		}
	}
}
