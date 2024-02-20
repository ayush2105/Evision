package com.api.Personal.Detial.service;

import com.api.Personal.Detial.entities.PersonalDetailInfo;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PersonalDetailInfoService {
    public List<PersonalDetailInfo> getAllPersonalInfo();
    public void addPersonalDetials(PersonalDetailInfo personalDetailInfo);
    public void updatePersonalDetials(PersonalDetailInfo personalDetailInfo,int pid);
    public void deletePersonalDetials(int pid);

}
