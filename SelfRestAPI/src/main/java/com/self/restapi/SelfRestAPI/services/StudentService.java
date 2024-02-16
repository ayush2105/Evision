package com.self.restapi.SelfRestAPI.services;

import com.self.restapi.SelfRestAPI.entities.StudentInfo;
import com.self.restapi.SelfRestAPI.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepo;
    public List<StudentInfo> getAllInfo() {
        return studentRepo.findAll();
    }
    public void addStudent(StudentInfo studentInfo){
        studentRepo.save(studentInfo);
    }
    public void updateStudent(StudentInfo studentInfo, int rollNumber){
        StudentInfo existingStudent=studentRepo.findById(rollNumber).orElse(null);
        if(existingStudent!=null){
            existingStudent.setName(studentInfo.getName());
            existingStudent.setLastName(studentInfo.getLastName());
            existingStudent.setMobileNumber(studentInfo.getMobileNumber());
            existingStudent.setEmail(studentInfo.getEmail());
            existingStudent.setRollNumber(studentInfo.getRollNumber());
            studentRepo.save(existingStudent);
        }




//           studentRepo.save(studentInfo);
    }
    public void deleteStudent(int rollNumber) {
        studentRepo.deleteById(rollNumber);
    }
}
