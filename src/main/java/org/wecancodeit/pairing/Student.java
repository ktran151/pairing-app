package org.wecancodeit.pairing;

public class Student {

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	private String name;
	private int id;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

}
