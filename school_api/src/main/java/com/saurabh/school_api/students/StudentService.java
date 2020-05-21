package com.saurabh.school_api.students;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


	public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<Student>();        
        studentRepository.findAll().forEach(students::add);
        return students;
    }
    
    public Student getStudent(String id) {
		return studentRepository.findById(id).get();
	}

	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	public void updateStudent(Student student){
        studentRepository.save(student);
    }

	public void deleteStudent(String id) {
        studentRepository.deleteById(id);
	}
    
        
}