package com.softwareEngineering.assignment1tests;

import com.softwareEngineering.assignment1.*;
import org.joda.time.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by boyd on 18/09/17.
 */
public class StudentTest {

    @Test
    public void testStudentGetters() {
        LocalDate dob = new LocalDate(1996,11,2);
        Student student = new Student("Aidan", dob, 14521303);
        String expectedName = "Aidan";
        String expectedUsername = "Aidan20";
        int expectedAge = 20;
        int expectedID = 14521303;
        LocalDate expectedDOB = new LocalDate(1996,11,2);

        assertEquals(expectedName,student.getName());
        assertEquals(expectedDOB, student.getDateOfBirth());
        assertEquals(expectedID, student.getId());
        assertEquals(expectedUsername, student.getUsername());
        assertEquals(expectedAge, student.getAge());
    }

    @Test
    public void testStudentSetters() {
        LocalDate dob = new LocalDate(1997,10,4);
        Student student = new Student("Brian", dob, 123456);

        String expectedName = "Brian";
        String expectedUsername = "Brian19";
        int expectedAge = 19;
        int expectedID = 123456;
        LocalDate expectedDOB = new LocalDate(1997,10,4);

        assertEquals(expectedName,student.getName());
        assertEquals(expectedDOB, student.getDateOfBirth());
        assertEquals(expectedID, student.getId());
        assertEquals(expectedUsername, student.getUsername());
        assertEquals(expectedAge, student.getAge());

        student.setName("Aidan");
        student.setDateOfBirth(new LocalDate(1996,11,2));
        student.setId(14521303);

        expectedName = "Aidan";
        expectedUsername = "Aidan20";
        expectedAge = 20;
        expectedID = 14521303;
        expectedDOB = new LocalDate(1996,11,2);

        assertEquals(expectedName,student.getName());
        assertEquals(expectedDOB, student.getDateOfBirth());
        assertEquals(expectedID, student.getId());
        assertEquals(expectedUsername, student.getUsername());
        assertEquals(expectedAge, student.getAge());
    }

    @Test
    public void testGetUsername() {
        LocalDate dob = new LocalDate(1996,11,2);
        Student student = new Student("George", dob, 987654);
        String expectedUsername = "George20";

        assertEquals(expectedUsername, student.getUsername());

        student.setName("Greg");
        expectedUsername = "Greg20";

        assertEquals(expectedUsername, student.getUsername());

        student.setDateOfBirth(new LocalDate(1990,6,29));
        expectedUsername = "Greg27";

        assertEquals(expectedUsername,student.getUsername());

        student.setName("Aidan Boyd");
        expectedUsername = "AidanBoyd27";

        assertEquals(expectedUsername,student.getUsername());

        student.setName("Hugh Denis Mulligan");
        expectedUsername = "HughDenisMulligan27";

        assertEquals(expectedUsername,student.getUsername());
    }

    @Test
    public void testCalculateAgeMethod() {
        LocalDate dob = new LocalDate(1996,11,2);
        Student student = new Student("Aidan", dob, 14521303);
        int expectedAge = 20;

        assertEquals(expectedAge, student.getAge());

        LocalDate newDOB = new LocalDate(1950, 4, 30);
        student.setDateOfBirth(newDOB);
        expectedAge = 67;

        assertEquals(expectedAge, student.getAge());
    }

}
