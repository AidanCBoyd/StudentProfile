package com.softwareEngineering.assignment1tests;

import com.softwareEngineering.assignment1.*;
import org.joda.time.*;
import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by Aidan Boyd on 19/09/17.
 */
public class CourseTest {

    @Test
    public void testCourseGetters() {
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

        Module module1 = new Module("Digital Systems", "EE344", studentList, "Dr. Fearghal Morgan");
        Module module2= new Module("Programming", "EE321", studentList, "Dr. Enda Barrett");
        Module module3 = new Module("Chemistry", "EE446", studentList, "Dr. Martin Glavin");


        LocalDate startDate = new LocalDate(2017, 9,1);
        LocalDate endDate = new LocalDate(2017, 11, 30);
        List<Module> moduleList = new ArrayList<Module>();
        moduleList.add(module1);
        moduleList.add(module2);
        moduleList.add(module3);

        Course course = new Course("Electronic and Computer Engineering", "4BP1", moduleList, startDate, endDate);

        String expectedName = "Electronic and Computer Engineering";
        String expectedCode = "4BP1";
        LocalDate expectedStart = new LocalDate(2017,9,1);
        LocalDate expectedEnd = new LocalDate(2017,11,30);

        assertEquals(expectedName, course.getCourseName());
        assertEquals(expectedCode, course.getCourseCode());
        assertEquals(expectedStart, course.getStartDate());
        assertEquals(expectedEnd, course.getFinishDate());
        assertEquals(moduleList, course.getModules());
    }

    @Test
    public void testCourseSetters() {

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

        Module module1 = new Module("Digital Systems", "EE344", studentList, "Dr. Fearghal Morgan");
        Module module2= new Module("Programming", "EE321", studentList, "Dr. Enda Barrett");
        Module module3 = new Module("Chemistry", "EE446", studentList, "Dr. Martin Glavin");


        LocalDate startDate = new LocalDate(2017, 9,1);
        LocalDate endDate = new LocalDate(2017, 11, 30);
        List<Module> moduleList = new ArrayList<Module>();
        moduleList.add(module1);
        moduleList.add(module2);
        moduleList.add(module3);

        Course course = new Course("Electronic and Computer Engineering", "4BP1", moduleList, startDate, endDate);

        String expectedName = "Electronic and Computer Engineering";
        String expectedCode = "4BP1";
        LocalDate expectedStart = new LocalDate(2017,9,1);
        LocalDate expectedEnd = new LocalDate(2017,11,30);

        assertEquals(expectedName, course.getCourseName());
        assertEquals(expectedCode, course.getCourseCode());
        assertEquals(expectedStart, course.getStartDate());
        assertEquals(expectedEnd, course.getFinishDate());
        assertEquals(moduleList, course.getModules());

        course.setCourseCode("3BP1");
        course.setCourseName("ECE");
        course.setStartDate(new LocalDate(2017, 9, 4));
        course.setFinishDate(new LocalDate(2017, 12, 15));
        List<Module> newModList = new ArrayList<Module>();
        newModList.add(module2);
        course.setModules(newModList);

        expectedName = "ECE";
        expectedCode = "3BP1";
        expectedStart = new LocalDate(2017, 9, 4);
        expectedEnd = new LocalDate(2017, 12, 15);

        assertEquals(expectedName, course.getCourseName());
        assertEquals(expectedCode, course.getCourseCode());
        assertEquals(expectedStart, course.getStartDate());
        assertEquals(expectedEnd, course.getFinishDate());
        assertEquals(newModList, course.getModules());

    }


    @Test
    public void testAddModuleMethod() {
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

        Module module1 = new Module("Digital Systems", "EE344", studentList, "Dr. Fearghal Morgan");
        Module module2= new Module("Programming", "EE321", studentList, "Dr. Enda Barrett");
        Module module3 = new Module("Chemistry", "EE446", studentList, "Dr. Martin Glavin");


        LocalDate startDate = new LocalDate(2017, 9,1);
        LocalDate endDate = new LocalDate(2017, 11, 30);
        List<Module> moduleList = new ArrayList<Module>();
        moduleList.add(module1);
        moduleList.add(module2);
        moduleList.add(module3);

        Course course = new Course("Electronic and Computer Engineering", "4BP1", moduleList, startDate, endDate);

        assertEquals(moduleList, course.getModules());

        Module newModule = new Module("Physics", "EE348", studentList, "Dr. Pat McGarry");

        course.addModule(newModule);
        moduleList.add(newModule);

        assertEquals(moduleList, course.getModules());
    }
}
