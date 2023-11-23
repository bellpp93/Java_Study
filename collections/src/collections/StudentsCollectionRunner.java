package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		
		List<Student> students = List.of(new Student(1, "Ranga"),
				new Student(100, "Adam"),
				new Student(2, "Eve"));
		List<Student> studentsAI = new ArrayList<>(students);
		
		System.out.println(studentsAI);  // [1 Ranga, 100 Adam, 2 Eve]
		
		Collections.sort(studentsAI);
		System.out.println("Desc " + studentsAI);  // Desc [100 Adam, 2 Eve, 1 Ranga]
		
//		Collections.sort(studentsAI, new AscendingStudentComparator());
		
		studentsAI.sort(new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator " + studentsAI);  // AscendingStudentComparator [1 Ranga, 2 Eve, 100 Adam]
	}
}