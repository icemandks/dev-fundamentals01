package student;

public class Student {
	public final int NUM_OF_TESTS = 3;
	private String name;
	private int[] tests;
	private String courseGrade;
	
	public void Student() {
		this("no name");
	}

	public void Student(String name) {
		this.name = name;
		this.tests = new int[this.NUM_OF_TESTS];
		this.courseGrade = "***";
	}

	public String getCourseGrade() {
		return this.courseGrade;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTestScore(int test) {
		return this.tests[test - 1];
	}

	public void setTestScore(int test, int score) {
		this.tests[test - 1] = score;
	}

	public String computeCourseGrade() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
