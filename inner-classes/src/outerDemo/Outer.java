package outerDemo;

public class Outer {
	
	static class Nested_Demo {
		public static void my_method() {
			System.out.println("This is my nested class");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Nested_Demo nested	= new Outer.Nested_Demo();
		nested.my_method();
		
		Outer.Nested_Demo.my_method();
	}

}
