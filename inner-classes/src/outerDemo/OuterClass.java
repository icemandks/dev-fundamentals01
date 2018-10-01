package outerDemo;

public class OuterClass {
	
	void my_Method() {
		int num = 23;
		
		class MethodInner_Demo {
			public void print() {
				System.out.println("this is method inner class " + num);
			}
		}
		
		MethodInner_Demo inner = new MethodInner_Demo();
		inner.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer = new OuterClass();
		outer.my_Method();
	}

}
