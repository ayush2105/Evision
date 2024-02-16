package com.jpa.test.dao;

import com.jpa.test.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserRepository extends CrudRepository<User, Integer> {
    public List<User> findByName(String name);
    @Query("select u from User u")
    public List<User> getAllUser();

    @Query("select u from User u where name=:n")
    public List<User> getUserByName(@Param("n")String name);

    @Query(value = "select * from User",nativeQuery = true)
    public List<User> getUser();

}
