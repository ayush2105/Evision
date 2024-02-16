package com.self.restapi.SelfRestAPI.repository;

import com.self.restapi.SelfRestAPI.entities.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentInfo,Integer> {
}
