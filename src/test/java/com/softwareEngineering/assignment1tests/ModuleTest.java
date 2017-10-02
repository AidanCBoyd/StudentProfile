package com.softwareEngineering.assignment1tests;

import com.softwareEngineering.assignment1.*;
import org.joda.time.*;
import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by boyd on 19/09/17.
 */
public class ModuleTest {

    @Test
    public void testModuleGetters() {

        LocalDate genericDOB = new LocalDate(1995, 1,1);
        Student s1 = new Student("Aidan", genericDOB, 12345);
        Student s2 = new Student("Gavin", genericDOB, 12346);
        Student s3 = new Student("Paddy", genericDOB, 12347);
        Student s4 = new Student("John", genericDOB, 12348);
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);


        Module module = new Module("Digital Systems", "EE344", studentList, "Dr. Fearghal Morgan");

        String expectedName = "Digital Systems";
        String expectedCode = "EE344";
        String expectedLecturer = "Dr. Fearghal Morgan";
        List<Student> expectedList = studentList;

        assertEquals(expectedName, module.getModuleName());
        assertEquals(expectedCode, module.getModuleCode());
        assertEquals(expectedLecturer, module.getLecturer());
        assertEquals(expectedList, module.getStudentList());
    }

    @Test
    public void testModuleSetters() {
        LocalDate genericDOB = new LocalDate(1995, 1,1);
        Student s1 = new Student("Aidan", genericDOB, 12345);
        Student s2 = new Student("Gavin", genericDOB, 12346);
        Student s3 = new Student("Paddy", genericDOB, 12347);
        Student s4 = new Student("John", genericDOB, 12348);
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);


        Module module = new Module("Digital Systems", "EE344", studentList, "Dr. Fearghal Morgan");

        String expectedName = "Digital Systems";
        String expectedCode = "EE344";
        String expectedLecturer = "Dr. Fearghal Morgan";
        List<Student> expectedList = studentList;

        assertEquals(expectedName, module.getModuleName());
        assertEquals(expectedCode, module.getModuleCode());
        assertEquals(expectedLecturer, module.getLecturer());
        assertEquals(expectedList, module.getStudentList());

        module.setLecturer("Dr. Martin Glavin");
        module.setModuleCode("EE445");
        module.setModuleName("Programming");
        List<Student> newList = new ArrayList<Student>();
        newList.add(s2);
        module.setStudentList(newList);

        expectedLecturer = "Dr. Martin Glavin";
        expectedCode = "EE445";
        expectedName = "Programming";
        expectedList = newList;

        assertEquals(expectedName, module.getModuleName());
        assertEquals(expectedCode, module.getModuleCode());
        assertEquals(expectedLecturer, module.getLecturer());
        assertEquals(expectedList, module.getStudentList());
    }

    @Test
    public void testAddStudentMethod() {

        LocalDate genericDOB = new LocalDate(1995, 1,1);
        Student s1 = new Student("Aidan", genericDOB, 12345);
        Student s2 = new Student("Gavin", genericDOB, 12346);
        Student s3 = new Student("Paddy", genericDOB, 12347);
        Student s4 = new Student("John", genericDOB, 12348);
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);


        Module module = new Module("Digital Systems", "EE344", studentList, "Dr. Fearghal Morgan");

        List<Student> expectedList = studentList;

        assertEquals(expectedList, module.getStudentList());

        Student newStudent1 = new Student("Joe", new LocalDate(1996,2,2), 135797);
        Student newStudent2 = new Student("Keith", new LocalDate(1996,2,2), 135797);

        module.addStudent(newStudent1);
        module.addStudent(newStudent2);

        studentList.add(newStudent1);
        studentList.add(newStudent2);

        assertEquals(studentList, module.getStudentList());
    }

}
