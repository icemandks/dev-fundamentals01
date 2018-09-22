package student;

public class GraduatedStudent extends Student {
	
	public GraduatedStudent(String name) {
		super(name);
	}

	public String computeCourseGrade() {
		int total = 0;

		for (int test : this.tests) {
			total += test;
		}

		if (total / this.NUM_OF_TESTS >= 80) {
			this.courseGrade = "Passed";
		}
		else {
			this.courseGrade = "Failed";
		}

		return this.courseGrade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraduatedStudent pedro = new GraduatedStudent("pedro");
		pedro.setTestScore(1, 90);
		pedro.setTestScore(2, 60);
		pedro.setTestScore(3, 80);

		System.out.println(pedro.computeCourseGrade());
	}

}
