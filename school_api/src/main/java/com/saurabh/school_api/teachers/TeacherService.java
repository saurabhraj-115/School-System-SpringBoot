package com.saurabh.school_api.teachers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

	
	public List<Teacher> getAllTeachers() {
        List<Teacher> Teachers = new ArrayList<Teacher>();        
        teacherRepository.findAll().forEach(Teachers::add);
        return Teachers;
    }
    
    public Teacher getTeacher(String id) {
		return teacherRepository.findById(id).get();
	}

	public void addTeacher(Teacher Teacher) {
		teacherRepository.save(Teacher);
	}

	public void updateTeacher(Teacher Teacher){
        teacherRepository.save(Teacher);
    }

	public void deleteTeacher(String id) {
        teacherRepository.deleteById(id);
	}
    
        
}