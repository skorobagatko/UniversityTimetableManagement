package com.skorobahatko.university.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Student")
public class Student extends Participant {
	
	public Student() {}

	public Student(String firstName, String lastName) {
		this(0, firstName, lastName);
	}
	
	public Student(int id, String firstName, String lastName) {
		super(id, firstName, lastName, new ArrayList<>());
	}
	
	public Student(String firstName, String lastName, List<Course> courses) {
		super(0, firstName, lastName, courses);
	}
	
	public Student(int id, String firstName, String lastName, List<Course> courses) {
		super(id, firstName, lastName, courses);
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + "]";
	}

}
