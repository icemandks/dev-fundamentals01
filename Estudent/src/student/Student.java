package student;

public class Student {
	public final int NUM_OF_TESTS = 3;
	protected String name;
	protected int[] tests;
	protected String courseGrade;

	public Student() {
		this("no name");
	}

	public Student(String name) {
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
		return "not implemented yet";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
