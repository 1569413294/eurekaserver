package com.springcloud.provider2.controller;

import com.springcloud.provider2.entity.Student;
import com.springcloud.provider2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("provider")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Value("${server.port}")
    private String port;
    @RequestMapping("saveorUpate")
    public void saveorUpate(Student student) {
        studentService.saveorUpate(student);
    }

    @RequestMapping("delete")
    public void delete(int id) {
        studentService.delete(id);
    }

    @RequestMapping("finAll")
    public Collection<Student> finAll() {
        return studentService.finAll();
    }

    @RequestMapping("index")
    public  String index(){
        return "现在的是：provider2";
    }


}
