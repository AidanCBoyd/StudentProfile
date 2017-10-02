package com.softwareEngineering.assignment1;

import org.joda.time.LocalDate;

import java.util.List;

/**
 * Created by boyd on 18/09/17.
 */
public class Course {


    private String courseName;
    private String courseCode;
    private List<Module> modules;
    private LocalDate startDate;
    private LocalDate finishDate;

    public Course(String name, String code, List<Module> modList, LocalDate start, LocalDate end) {
        this.courseName = name;
        this.courseCode = code;
        this.modules = modList;
        this.startDate = start;
        this.finishDate = end;
    }

    /**
     * Return list of modules associated with course
     * @return list of modules
     */
    public List<Module> getModules() {
        return modules;
    }

    /**
     * Set the modules for the course
     * @param modules
     */
    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    /**
     * Returns course name
     * @return name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Set course name
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Get course code
     * @return course code
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Set course code
     * @param courseCode
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * Get academic start date
     * @return start date LocalDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Set start date
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * Get end date
     * @return end date
     */
    public LocalDate getFinishDate() {
        return finishDate;
    }

    /**
     * Set end date
     * @param finishDate
     */
    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    /**
     * Add module to the course
     * @param m
     */
    public void addModule(Module m) {
        modules.add(m);
    }
}
