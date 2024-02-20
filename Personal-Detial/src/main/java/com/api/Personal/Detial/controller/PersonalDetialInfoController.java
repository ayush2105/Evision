package com.api.Personal.Detial.controller;

import com.api.Personal.Detial.entities.PersonalDetailInfo;
import com.api.Personal.Detial.service.PersonalDetialInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonalDetialInfoController {

    @Autowired
    public PersonalDetialInfoServiceImpl personalDetialInfoServiceImpl;
    @GetMapping("/details")
    public List<PersonalDetailInfo>getAllDetail(){
        return personalDetialInfoServiceImpl.getAllPersonalInfo();
    }
    @PostMapping("/details")
    public void addPersonalDetails(@RequestBody PersonalDetailInfo personalDetailInfo){
        personalDetialInfoServiceImpl.addPersonalDetials(personalDetailInfo);
    }

    @PutMapping("/details/{pid}")
    public void updatePersonalDetails(@RequestBody PersonalDetailInfo personalDetailInfo,@PathVariable("pid") int pid){
        personalDetialInfoServiceImpl.updatePersonalDetials(personalDetailInfo,pid);
    }

    @DeleteMapping("/details/{pid}")
        public void deletePersonalDetails(@PathVariable("pid") int pid){
            personalDetialInfoServiceImpl.deletePersonalDetials(pid);

        }
}
