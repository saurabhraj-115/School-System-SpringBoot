package com.saurabh.school_api.teachers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;


    @RequestMapping("/teachers")
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

    @RequestMapping("/teachers/{id}")
    public Teacher getTeacher(@PathVariable String id){
        return teacherService.getTeacher(id);
    }

    @RequestMapping(method= RequestMethod.POST , value = "/teachers")
    public void addTeacher(@RequestBody Teacher teacher){
        teacherService.addTeacher(teacher);
    } 

    @RequestMapping(method= RequestMethod.PUT , value = "/teachers/{id}")
    public void updateTeacher(@RequestBody Teacher teacher , @PathVariable String id){
        teacherService.updateTeacher(teacher);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/teachers/{id}")
        public void deleteTeacher(@PathVariable String id){
            teacherService.deleteTeacher(id);            
        }
    
    
    
}