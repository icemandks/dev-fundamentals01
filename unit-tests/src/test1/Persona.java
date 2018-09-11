package test1;

public class Persona {
	private String name = "";
	private static String allNames = "";
	private int ci;
	private int age;
	
	public Persona(String name) {
		this.name = name;
		allNames = allNames + " " + name;
	}
	
	public String getName() {
		return name;
	}
	
	public void run () {
		System.out.println("I am running by default");
	}
	
	public void run (int distance) {
		System.out.println("I am running: " + distance + " distance");
	}
	
	public void run (Persona persona) {
		System.out.println("I am running with: " + persona.getName());
	}
}
