package com.saurabh.school_api.teachers;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.saurabh.school_api.grades.Grade;


@Entity
public class Teacher {

    @Id
    private String id;
    private String name;
    private String subject;

    @ManyToOne
    private Grade grade;

    public Teacher() {
    }

    public Teacher(String id , String name, String subject, String gradeId ) {
        this.id = id;
        this.name= name;
        this.subject = subject;
        this.grade = new Grade(gradeId);
    }

    
    /**
     * @return String return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }


    
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return String return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }


    /**
     * @return Grade return the grade
     */
    public Grade getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

}