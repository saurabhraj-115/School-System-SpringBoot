package com.saurabh.school_api.students;

import java.util.List;

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

    @RequestMapping("/")
    public String basePage(){
        return studentService.basePage();
    }

    @RequestMapping("/students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

    @RequestMapping("/students/{id}")
    public Student getStudent(@PathVariable String id){
        return studentService.getStudent(id);
    }

    @RequestMapping(method= RequestMethod.POST , value = "/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    } 

    @RequestMapping(method= RequestMethod.PUT , value = "/students/{id}")
    public void updateStudent(@RequestBody Student student , @PathVariable String id){
        studentService.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/students/{id}")
        public void deleteStudent(@PathVariable String id){
            studentService.deleteStudent(id);            
        }
    
    
    
}