package com.skorobahatko.university.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.skorobahatko.university.domain.Course;
import com.skorobahatko.university.domain.Lecture;
import com.skorobahatko.university.domain.Participant;
import com.skorobahatko.university.domain.Student;
import com.skorobahatko.university.domain.Teacher;
import com.skorobahatko.university.domain.Timetable;

public class TestUtils {

	public static Course getTestCourse() {
		Course course = new Course("Test Course");
		return course;
	}
	
	public static Lecture getTestLectureWithCourseId(int courseId) {
		return new Lecture("Lecture 1", courseId, LocalDate.of(2020, 12, 1), LocalTime.of(8, 00),
				LocalTime.of(9, 00), 100);
	}

	public static List<Lecture> getTestLecturesWithCourseId(int courseId) {
		List<Lecture> lectures = new ArrayList<>();
		lectures.add(new Lecture("Lecture 1", courseId, LocalDate.of(2020, 12, 1), LocalTime.of(8, 00),
				LocalTime.of(9, 00), 100));
		lectures.add(new Lecture("Lecture 2", courseId, LocalDate.of(2020, 12, 3), LocalTime.of(10, 00),
				LocalTime.of(11, 00), 100));
		lectures.add(new Lecture("Lecture 3", courseId, LocalDate.of(2020, 12, 7), LocalTime.of(8, 00),
				LocalTime.of(9, 00), 100));
		return lectures;
	}

	public static Participant getTestParticipant() {
		String firstName = "John";
		String lastName = "Johnson";

		return new Student(firstName, lastName);
	}
	
	public static List<Student> getTestStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("John", "Johnson"));
		students.add(new Student("Andrew", "Anderson"));
		students.add(new Student("Harry", "Harrison"));
		
		return students;
	}
	
	public static List<Teacher> getTestTeachers() {
		List<Teacher> teachers = new ArrayList<>();
		teachers.add(new Teacher("John", "Johnson"));
		teachers.add(new Teacher("Andrew", "Anderson"));
		teachers.add(new Teacher("Harry", "Harrison"));
		
		return teachers;
	}

	public static Timetable getTestTimetableForParticipant(Participant participant) {
		LocalDate startDate = LocalDate.of(2020, 12, 1);
		LocalDate endDate = LocalDate.of(2020, 12, 3);
		return new Timetable(participant, startDate, endDate);
	}

}
