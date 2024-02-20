package com.api.Personal.Detial.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class PersonalDetailInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private String name;
    private String lastName;
    private long mobileNumber;
    private String email;
    public PersonalDetailInfo(){
        super();
    }
    public PersonalDetailInfo(int pid,String name,String lastName,long mobileNumber,String email){
        this.pid=pid;
        this.name=name;
        this.lastName=lastName;
        this.mobileNumber=mobileNumber;
        this.email=email;
    }









}
