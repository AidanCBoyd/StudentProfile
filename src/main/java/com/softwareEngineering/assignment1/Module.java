package com.softwareEngineering.assignment1;

import java.util.List;

/**
 * Created by boyd on 18/09/17.
 */
public class Module {

    private String moduleName;
    private String moduleCode;
    private List<Student> studentList;
    private String lecturer;

    public Module(String name, String code, List<Student> students, String lect) {
        this.moduleName = name;
        this.moduleCode = code;
        this.studentList = students;
        this.lecturer = lect;
    }

    /**
     * get Module Name
     * @return name
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * Set module name
     * @param name
     */
    public void setModuleName(String name) {
        this.moduleName = name;
    }

    /**
     * Get module code
     * @return module code
     */
    public String getModuleCode() {
        return this.moduleCode;
    }

    /**
     * Set module code
     * @param code
     */
    public void setModuleCode(String code) {
        this.moduleCode = code;
    }

    /**
     * Get name of lecturer
     * @return name of lecturer
     */
    public String getLecturer() {
        return this.lecturer;
    }

    /**
     * Set name of lecturer
     * @param lect = name of lecturers
     */
    public void setLecturer(String lect) {
        this.lecturer = lect;
    }

    /**
     * Get list of students
     * @return studentList
     */
    public List<Student> getStudentList() {
        return this.studentList;
    }

    /**
     * Set list of students
     * @param list
     */
    public void setStudentList(List<Student> list) {
        this.studentList = list;
    }

    /**
     * Add student to the module
     * @param s
     */
    public void addStudent(Student s) {
        studentList.add(s);
    }
}
