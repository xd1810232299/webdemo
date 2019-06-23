package com.example.webdemo.entity;


import javax.persistence.*;

@Entity
@Table(name="t_test")
public class Test {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)//设置mysql主键自增
    private Integer id;

    private String test;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
