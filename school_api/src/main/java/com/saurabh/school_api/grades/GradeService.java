package com.saurabh.school_api.grades;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeService {

    @Autowired
    GradeRepository gradeRepository;

	public String basePage() {
		return "Welcome to the School";
	}

	public List<Grade> getAllGrades() {
        List<Grade> grades = new ArrayList<Grade>();
        gradeRepository.findAll().forEach(grades::add);
		return grades;
	}

	public Grade getGrade(String id) {
		return gradeRepository.findById(id).get();
    }

	public void addGrade(Grade grade) {
        gradeRepository.save(grade);
    }

	public void updateGrade(Grade grade, String id) {
        gradeRepository.save(grade);
	}

	public void deleteGrade(String id) {
        gradeRepository.deleteById(id);
	}
    
    



    
}