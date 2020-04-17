package com.example.webdemo.repository;

import com.example.webdemo.entity.UserDao;
import com.example.webdemo.entity.WarehouseStockContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TestRepository extends JpaRepository<WarehouseStockContent,Integer> {


    @Query(value = " select * from t_user ", nativeQuery = true)
    List<UserDao> findByPn();

}
