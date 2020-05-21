package com.saurabh.school_api.teachers;

import java.util.List;

import com.saurabh.school_api.grades.Grade;

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


    @RequestMapping("grades/{gradeId}/teachers")
    public List<Teacher> getAllTeachers(@PathVariable String gradeId){
        return teacherService.getAllTeachers(gradeId);
    }

    @RequestMapping("grades/{gradeId}/teachers/{teacherId}")
    public Teacher getTeacher(@PathVariable("teacherId") String teacherId){
        return teacherService.getTeacher(teacherId);
    }

    @RequestMapping(method= RequestMethod.POST , value = "grades/{gradeId}/teachers")
    public void addTeacher(@RequestBody Teacher teacher, @PathVariable("gradeId") String gradeId){
        teacher.setGrade(new Grade(gradeId));
        teacherService.addTeacher(teacher);
    } 

    @RequestMapping(method= RequestMethod.PUT , value = "grades/{gradeId}/teachers/{teacherId}")
    public void updateTeacher(@RequestBody Teacher teacher , @PathVariable("gradeId") String gradeId){
        teacher.setGrade(new Grade(gradeId));
        teacherService.updateTeacher(teacher);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "grades/{gradeId}/teachers/{teacherId}")
        public void deleteTeacher(@PathVariable("teacherId") String teacherId){
            teacherService.deleteTeacher(teacherId);            
        }
    
    
    
}