package com.springcloud.provider.controller;

import com.springcloud.provider.entity.Student;
import com.springcloud.provider.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

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
        return "现在的是：provider";
    }

}
