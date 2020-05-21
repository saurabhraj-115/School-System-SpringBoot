package com.saurabh.school_api.teachers;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, String> {
    public List<Teacher> findByGradeId(String gradeId);
    
}