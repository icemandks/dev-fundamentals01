package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void test() {
		Student[] students = new Student[10];
		GraduatedStudent pedro = new GraduatedStudent("Pedro");
		UndergraduatedStudent maria = new UndergraduatedStudent("Maria");

		pedro.setTestScore(1, 90);
		pedro.setTestScore(2, 70);
		pedro.setTestScore(3, 80);

		maria.setTestScore(1, 80);
		maria.setTestScore(2, 70);
		maria.setTestScore(3, 80);

		students[0] = pedro;
		students[1] = maria;
		
		System.out.println(students.length);

		for (Student student: students) {
			String actual = student.computeCourseGrade();
			String expected = "Passed";
			
			assertEquals(expected, actual);
		}
	}

}
