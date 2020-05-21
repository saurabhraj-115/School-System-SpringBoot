package com.saurabh.school_api.grades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Grade {

@Id
private String id;


    public Grade() {
    }

    public Grade(String id) {
        this.id= id;
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

}