package com.skorobahatko.university.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TimetableRecordTest {
	
	private TimetableRecord record;

	@BeforeEach
	void setUp() throws Exception {
		record = getTestTimetableRecord();
	}
	
	@Test
	void testEqualsMethodReturnsTrueForEqualTimetableRecords() {
		TimetableRecord other = getTestTimetableRecord();
		
		assertTrue(record.equals(other));
	}
	
	@Test
	void testEqualsMethodReturnsFalseForNonEqualTimetableRecords() {
		record = getTestTimetableRecord();
		
		Course course = new Course("QWERTY-100", "Qwerty course");
		String lectureName = "Qwerty lecture";
		LocalDate lectureDate = LocalDate.of(2021, 12, 1);
		LocalTime lectureStartTime = LocalTime.of(9, 30);
		LocalTime lectureEndTime = LocalTime.of(11, 0);
		int roomNumber = 201;
		Lecture lecture = new Lecture(lectureName, course, lectureDate, lectureStartTime, lectureEndTime, roomNumber);
		TimetableRecord other = TimetableRecord.of(lecture);
		
		assertTrue(!record.equals(other));
	}
	
	@Test
	void testEqualsMethodReturnsTrueForSameTimetableRecords() {
		TimetableRecord other = record;
		
		assertTrue(record.equals(other));
	}
	
	@Test
	void testEqualsMethodReturnsFalseForNullArgument() {
		TimetableRecord other = null;
		
		assertTrue(!record.equals(other));
	}
	
	@Test
	void testEqualsMethodReturnsFalseWithObjectArgument() {
		Object other = new Object();
		
		assertTrue(!record.equals(other));
	}
	
	private TimetableRecord getTestTimetableRecord() {
		Course course = new Course("TST-100", "Test course");
		String lectureName = "Test lecture";
		LocalDate lectureDate = LocalDate.of(2020, 11, 5);
		LocalTime lectureStartTime = LocalTime.of(7, 30);
		LocalTime lectureEndTime = LocalTime.of(9, 0);
		int roomNumber = 201;
		Lecture lecture = new Lecture(lectureName, course, lectureDate, lectureStartTime, lectureEndTime, roomNumber);
		TimetableRecord result = TimetableRecord.of(lecture);
		
		return result;
	}

}