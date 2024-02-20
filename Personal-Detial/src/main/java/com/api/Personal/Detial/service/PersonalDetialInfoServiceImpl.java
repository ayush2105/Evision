package com.api.Personal.Detial.service;

import com.api.Personal.Detial.entities.PersonalDetailInfo;
import com.api.Personal.Detial.repository.PersonalDetialInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PersonalDetialInfoServiceImpl implements PersonalDetailInfoService {
    @Autowired
    PersonalDetialInfoRepo personalDetialInfoRepo;


    @Override
    public List<PersonalDetailInfo> getAllPersonalInfo() {
        return personalDetialInfoRepo.findAll();
    }
    public void addPersonalDetials(PersonalDetailInfo personalDetailInfo){
        personalDetialInfoRepo.save(personalDetailInfo);
    }
    public void updatePersonalDetials(PersonalDetailInfo personalDetailInfo,int pid){
        PersonalDetailInfo p= (PersonalDetailInfo) personalDetialInfoRepo.findById(pid).orElse(null);
        if(p!=null){
            p.setName(personalDetailInfo.getName());
            p.setLastName(personalDetailInfo.getLastName());
            p.setMobileNumber(personalDetailInfo.getMobileNumber());
            p.setEmail(personalDetailInfo.getEmail());
            personalDetialInfoRepo.save(p);
        }
    }
    public void deletePersonalDetials(int pid){
        personalDetialInfoRepo.deleteById(pid);
    }







}
