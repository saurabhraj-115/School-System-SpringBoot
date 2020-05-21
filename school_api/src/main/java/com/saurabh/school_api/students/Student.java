package com.saurabh.school_api.students;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.saurabh.school_api.grades.Grade;



@Entity
public class Student {

    @Id
    private String id;
    private String name;

    @ManyToOne
    private Grade grade;

    public Student() {
    }

    public Student(String id , String name, String gradeId ) {
        this.id = id;
        this.name= name;
        this.grade = new Grade(gradeId);
    }


    

    /**
     * @return String return the id
     */
    public String getid() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setid(String id) {
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
     * @return Grades return the grade
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