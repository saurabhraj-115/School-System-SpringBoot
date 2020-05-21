package com.saurabh.school_api.grades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {

    @Autowired
    GradeService gradeService;

    @RequestMapping("/")
    public String basePage() {
        return gradeService.basePage();
    }

    @RequestMapping("/grades")
    public List<Grade> getAllGrades(){
        return gradeService.getAllGrades();
    }

    @RequestMapping("/grades/{id}")
    public Grade getGrade(@PathVariable String id){
        return gradeService.getGrade(id);
    }

    @RequestMapping(method = RequestMethod.POST , value = "/grades/")
    public void addGrade(@RequestBody Grade grade){
        gradeService.addGrade(grade);
    }

    @RequestMapping(method = RequestMethod.POST , value = "/grades/{id}")
    public void updateGrade(@PathVariable String id, @RequestBody Grade grade){
        gradeService.updateGrade(grade, id);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/grades/{id}")
    public void deleteGrade(@PathVariable String id){
        gradeService.deleteGrade(id);
    }


    
}