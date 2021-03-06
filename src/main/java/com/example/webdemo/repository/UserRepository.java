package com.example.webdemo.repository;

import com.example.webdemo.entity.User;
import com.example.webdemo.entity.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value = " select * from t_user ", nativeQuery = true)
    List<UserDao> findByPn();


    List<User> findDistinctByName(String name);

}
