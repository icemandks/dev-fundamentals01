package Samples;

public class GenericMethods {
	
	public static <T> boolean isEqual (GenericsType<T> g1, GenericsType<T> g2) {
		T value1 = g1.get();
		T value2 = g2.get();
		
		boolean result = value1.equals(value2);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsType<String> g1 = new GenericsType<>();
		g1.set("test");
		GenericsType<String> g2 = new GenericsType<>();
		g2.set("test");
		
		boolean isEqual = GenericMethods.<String>isEqual(g1,g2);
		System.out.println(isEqual);
		
		isEqual = GenericMethods.isEqual(g1, g2);
		System.out.println(isEqual);
	}

}
