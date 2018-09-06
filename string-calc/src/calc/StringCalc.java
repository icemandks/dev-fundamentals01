package calc;

import java.util.ArrayList;
import java.util.List;

public class StringCalc {
	private List<Integer> inputs = new ArrayList<Integer>();
	private int result = 0;
	
	public int Add(String text) {
//		List<String> digits = Arrays.asList(text.split(","));
		try {
			String[] digitStrings = text.split(",");

			for (String digit : digitStrings) {
				System.out.print(digit);
				int number = Integer.parseInt(digit);
				if (number < 0) {
					throw new Exception("Negative numbers are not allowed");
				}
				this.inputs.add(number);
			}

			this.result = this.sum(this.inputs);
			System.out.print(this.result);
			// return this.result;
		}
		catch (Exception e) {
			/* This is a generic Exception handler which means it can handle
			 * all the exceptions. This will execute if the exception is not
			 * handled by previous catch blocks.
			 */
			System.out.println("Exception occurred: " + e.getMessage());
		}
		return this.result;
	}
	
	private int sum(List<Integer> list) {
		int total = 0;
		for (int num : list) {
			total += num;
		}
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCalc cal = new StringCalc();
		System.out.print("hola");
		cal.Add("1,2,55");
		
	}
}