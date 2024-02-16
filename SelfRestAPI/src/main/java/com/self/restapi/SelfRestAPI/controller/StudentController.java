package com.self.restapi.SelfRestAPI.controller;

import com.self.restapi.SelfRestAPI.entities.StudentInfo;
import com.self.restapi.SelfRestAPI.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/student")
    public List<StudentInfo> getAllStudents(){
        return studentService.getAllInfo();
    }
    @PostMapping("/student")
    public void addStudent(@RequestBody StudentInfo studentInfo){
        studentService.addStudent(studentInfo);
    }

    @PutMapping("/student/{rId}")
    public void updateStudent(@RequestBody StudentInfo studentInfo,@PathVariable("rId") int rollNumber){
        studentService.updateStudent(studentInfo,rollNumber);
    }

    @DeleteMapping("/student/{rId}")
    public void deleteStudent(@PathVariable("rId") int rollNumber){
        studentService.deleteStudent(rollNumber);
    }




}
