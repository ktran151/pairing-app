package org.wecancodeit.pairing;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository {

	public Map<Integer, Student> cohort1 = new HashMap<>();

	public StudentRepository() {
		add(new Student(1, "Joe"));
		add(new Student(2, "Khoi"));
		add(new Student(3, "Thomas"));
		add(new Student(4, "Tre"));
		add(new Student(5, "Max"));
		add(new Student(6, "Riley"));
		add(new Student(7, "Wayne"));
		add(new Student(8, "Josh"));
		add(new Student(9, "Justin"));
		add(new Student(10, "Ingrid"));
		add(new Student(11, "Kelli"));
		add(new Student(12, "Alex"));
		add(new Student(13, "Jane"));
		add(new Student(14, "Kevin"));
	}

	public void add(Student student) {
		cohort1.put(student.getId(), student);
	}

	public Student getStudentById(int id) {
		return cohort1.get(id);
	}

	public void displayStudents() {

	}

}
