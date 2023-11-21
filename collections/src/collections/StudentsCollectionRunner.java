package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = List.of(new Student(1, "Ranga"),
				new Student(100, "Adam"),
				new Student(2, "Eve"));
		List<Student> studentsAI = new ArrayList<>(students);
		
		System.out.println(studentsAI);
		// [1 Ranga, 100 Adam, 2 Eve]
		
		Collections.sort(studentsAI);
//		System.out.println(studentsAI); // this.id, that.id
		// [1 Ranga, 2 Eve, 100 Adam]
		System.out.println(studentsAI); // that.id, this.id
		// [100 Adam, 2 Eve, 1 Ranga]
	}
}