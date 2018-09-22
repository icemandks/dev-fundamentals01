package student;

public class UndergraduatedStudent extends Student {
	
	public UndergraduatedStudent (String name) {
		super(name);
	}

	public String computeCourseGrade() {
		int total = 0;

		for (int test : this.tests) {
			total += test;
		}

		if (total / this.NUM_OF_TESTS >= 70) {
			this.courseGrade = "Passed";
		}
		else {
			this.courseGrade = "Failed";
		}

		return this.courseGrade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
