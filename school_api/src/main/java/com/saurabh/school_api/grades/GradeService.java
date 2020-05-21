package com.saurabh.school_api.grades;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.saurabh.school_api.students.Student;
import com.saurabh.school_api.students.StudentService;
import com.saurabh.school_api.teachers.Teacher;
import com.saurabh.school_api.teachers.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeService {

    @Autowired
	GradeRepository gradeRepository;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	TeacherService teacherService;

	public String basePage() {
		return "Welcome to the School";
	}

	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();

		List<Grade> grades = this.getAllGrades();

        ListIterator<Grade> li = grades.listIterator();
        while(li.hasNext()){
            Grade grade = (Grade)li.next();
			String gradeId = grade.getId();
			students.addAll(studentService.getAllStudents(gradeId));
        }
		return students;
	}


	public List<Teacher> getAllTeachers() {
		List<Teacher> teachers = new ArrayList<Teacher>();

		List<Grade> grades = this.getAllGrades();

        ListIterator<Grade> li = grades.listIterator();
        while(li.hasNext()){
            Grade grade = (Grade)li.next();
			String gradeId = grade.getId();
			teachers.addAll(teacherService.getAllTeachers(gradeId));
        }
		return teachers;
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