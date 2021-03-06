package calc;

import java.util.ArrayList;
import java.util.List;

public class StringCalc {
	private List<Integer> inputs = new ArrayList<Integer>();
	private int result = 0;
	private String regex = "(\n){1}|(,){1}";
	private List<String> customDelimiters = new ArrayList<String>();
	
	public int Add(String text) {

		try {
			if (text.length() > 1 && text.substring(0, 2).equals("//")){
				text = this.getDelimiters(text);
			}

			String[] digitStrings = text.split(this.regex);

			for (String digit : digitStrings) {
				int number = Integer.parseInt(digit);

				if (number < 0) {
					throw new Exception("Negative numbers are not allowed");
				}
				if (number < 1000) {
					this.inputs.add(number);
				}
			}

			this.result = this.sum(this.inputs);
			// System.out.print(this.result);
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

	private String getDelimiters(String cadena) throws Exception {
		String text = cadena.substring(2);

		while(text.substring(0, 1).equals("[")){
			int closeDelimiter = text.indexOf("]");

			if (closeDelimiter == -1){
				throw new Exception("Wrong format for custom delimiter, no closing bracket ] for the delimiter");
			}

			this.customDelimiters.add(text.substring(1, closeDelimiter));
			text = text.substring(closeDelimiter + 1);
		}

		if (text.substring(0,1).equals("\n")){
			this.updateRegex();
			text = text.substring(1);
		}
		else {
			throw new Exception("Wrong format for custom delimiter, no new line after the delimiters declaration");
		}

		return text;
	}
	
	private int sum(List<Integer> list) {
		int total = 0;
		for (int num : list) {
			total += num;
		}
		return total;
	}

	private void updateRegex() {
		if (this.customDelimiters.size() > 0) {
			for (String delimiter : this.customDelimiters) {
				this.regex += "|(" + delimiter + "){1}";
			}
		}
	}

	public void reset() {
		this.result = 0;
		this.inputs = new ArrayList<Integer>();
	}
	
	public static void main(String[] args) {
		StringCalc cal = new StringCalc();
		System.out.println(cal.Add("//[;][-]\n1,2\n55-4-2;5"));
		cal.reset();
		System.out.println(cal.Add("1"));
	}
}