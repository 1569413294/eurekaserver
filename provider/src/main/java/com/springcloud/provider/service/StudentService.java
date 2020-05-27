package com.springcloud.provider.service;

import com.springcloud.provider.entity.Student;
import lombok.Data;

import java.util.Collection;
import java.util.List;


public interface StudentService {

    //增or改
    void saveorUpate(Student student);
    //删
    void delete(int id);
    //查
    Collection<Student> finAll();

}
