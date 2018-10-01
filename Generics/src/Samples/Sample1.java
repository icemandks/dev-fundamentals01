package Samples;

import java.awt.List;
import java.util.ArrayList;

public class Sample1 {
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add(new Integer(5));
		
		for (Object current: list) {
//			String str = (String)current;
			System.out.println(current.toString());
		}
	}
}
