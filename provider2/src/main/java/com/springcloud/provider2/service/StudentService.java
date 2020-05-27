package com.springcloud.provider2.service;

import com.springcloud.provider2.entity.Student;

import java.util.Collection;


public interface StudentService {

    //增or改
    void saveorUpate(Student student);
    //删
    void delete(int id);
    //查
    Collection<Student> finAll();

}
