package com.saurabh.school_api.students;

import java.util.List;

import com.saurabh.school_api.grades.Grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    

    @RequestMapping("/grades/{gradeId}/students")
    public List<Student> getAllStudent(@PathVariable String gradeId){
        return studentService.getAllStudents(gradeId);
    }

    @RequestMapping("/grades/{gradeId}/students/{studentId}")
    public Student getStudent(@PathVariable("studentId") String studentId){
        return studentService.getStudent(studentId);
    }

    @RequestMapping(method= RequestMethod.POST , value = "/grades/{gradeId}/students")
    public void addStudent(@RequestBody Student student, @PathVariable("gradeID") String gradeId){
        student.setGrade(new Grade(gradeId));
        studentService.addStudent(student);
    } 

    @RequestMapping(method= RequestMethod.PUT , value = "/grades/{gradeId}/students/{studentId}")
    public void updateStudent(@RequestBody Student student , @PathVariable("gradeId") String gradeId){
        student.setGrade(new Grade(gradeId));
        studentService.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/grades/{gradeId}/students/{studentId}")
        public void deleteStudent(@PathVariable("studentId") String id){
            studentService.deleteStudent(id);            
        }
    
    
    
}