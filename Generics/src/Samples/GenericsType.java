package Samples;

public class GenericsType<TEST> {
	
	private TEST value;
	
	public TEST get() {
		return this.value;
	}
	
	public void set(TEST value) {
		this.value = value;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsType<String> type = new GenericsType<>();
		type.set("test");
		type.set("xyz");
		String str = type.get();
		System.out.println(str);
		
//		GenericsType<Integer>
	}

}
