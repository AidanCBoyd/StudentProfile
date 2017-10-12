package com.softwareEngineering.assignment1;

import org.joda.time.*;

import java.util.Date;

/**
 * Created by boyd on 18/09/17.
 */
public class Student {

    private String name;
    private LocalDate dateOfBirth;
    private int id;
    private String username;
    private int age;

    public Student(String nm, LocalDate DOB, int identification) {

        this.name = nm;
        this.dateOfBirth = DOB;
        this.id = identification;
        this.age = calculateAge();
        this.username = getUsername(this.name, this.age);
    }

    /**
     * This method creates a username for the student based on their age and name
     * @param name
     * @param age
     * @return username
     */
    private String getUsername(String name, int age) {

        //The id wil be in the form <name><age> i.e. Aidan20
        StringBuilder tempName =  new StringBuilder(name);

        tempName.append(age);

        String uName = tempName.toString();

        //If there are any spaces, remove those spaces
        // i.e. if they entered Aidan Boyd as the name this will be changed
        // to AidanBoyd
        if (uName.contains(" ")) {
            uName = uName.replaceAll("\\s+","");
        }

        return uName;
    }

    /**
     * Calculates the students age based on their date of birth
     * @return age
     */
    private int calculateAge() {
        LocalDate now = new LocalDate();
        Years yearsBetween = Years.yearsBetween(dateOfBirth, now);

        int studentAge = yearsBetween.getYears();

        return studentAge;
    }

    /**
     * Get student's age
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Get student's date of birth
     * @return DOB
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Set the student's date of birth
     * @param dob
     */
    public void setDateOfBirth(LocalDate dob) {
        this.dateOfBirth = dob;
        this.age = this.calculateAge();
        this.username = getUsername(this.name, this.age);
    }

    /**
     * Get the students name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set student's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
        this.username = getUsername(this.name,this.age);
    }

    /**
     * Get the student's ID
     * @return ID
     */
    public int getId() {
        return id;
    }

    /**
     * Set the student's ID
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get student's username
     * @return username
     */
    public String getUsername() {
        return username;
    }
}
