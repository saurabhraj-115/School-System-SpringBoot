package com.saurabh.school_api.grades;

import org.springframework.data.repository.CrudRepository;

public interface GradeRepository extends CrudRepository<Grade, String> {
    
}