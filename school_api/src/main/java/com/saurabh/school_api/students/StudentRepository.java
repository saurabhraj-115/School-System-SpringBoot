package com.saurabh.school_api.students;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {
    public List<Student> findByGradeId(String gradeId);
    
}