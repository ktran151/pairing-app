package org.wecancodeit.pairing;

import java.util.HashMap;
import java.util.Map;

public class PairedMapRepo {
	Map<Student, Student> pairs = new HashMap<>();

	public PairedMapRepo() {
//		this.student1id = student1id;
//		this.student2id = student2id;
//		this.student1Name = student1Name;
//		this.student2Name = student2Name;
//		pairs.put()		
	}

	int student1id;
	int student2id;
	String student1Name;
	String student2Name;

	public void add(Student student1, Student student2) {
		pairs.put(student1, student2);
	}

	public Student getStudent(Student testStudent1) {
		return pairs.get(testStudent1);
	}

	public int getRandomNumber() {
		int x = (int) (Math.random() * ((14 - 1) + 1)) + 1;
		return x;
	}

	public void addStudentThroughNum() {

	}
}
