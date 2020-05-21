package com.saurabh.school_api.teachers;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Teacher {

    @Id
    private String id;
    private String name;
    private String subject;

    public Teacher() {
    }

    public Teacher(String id , String name, String subject ) {
        this.id = id;
        this.name= name;
        this.subject = subject;
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

}