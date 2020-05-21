package com.saurabh.school_api.students;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {

    @Id
    private String id;
    private String name;

    public Student() {
    }

    public Student(String id , String name ) {
        this.id = id;
        this.name= name;
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

}