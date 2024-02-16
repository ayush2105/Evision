package com.self.restapi.SelfRestAPI.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "Student")
public class StudentInfo {
    @Column(name = "First_Name")
    private String name;
    private String lastName;
    private double mobileNumber;
    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rollNumber;
    public StudentInfo(){
        super();
    }
    public StudentInfo(String name,String lastName,double mobileNumber,String email,int rollNumber){
        super();
        this.name=name;
        this.lastName=lastName;
        this.mobileNumber=mobileNumber;
        this.email=email;
        this.rollNumber=rollNumber;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", email='" + email + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
