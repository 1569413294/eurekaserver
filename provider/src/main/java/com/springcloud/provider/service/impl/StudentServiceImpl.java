package com.springcloud.provider.service.impl;

import com.springcloud.provider.entity.Student;
import com.springcloud.provider.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: eurekaserver
 * @Package: com.springcloud.provider.service.impl
 * @ClassName: StudentServiceImpl
 * @Author: ggx
 * @Description:
 * @Date: 2020/5/25 0025 9:21
 * @Version: 1.0
 */
@Service
public class StudentServiceImpl  implements StudentService {


    private static Map<Integer,Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1,new Student(1,"张三",41));
        studentMap.put(2,new Student(2,"李四",42));
        studentMap.put(3,new Student(3,"王五",43));
    }


    @Override
    public void saveorUpate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void delete(int id) {
        studentMap.remove(id);
    }

    @Override
    public Collection<Student> finAll() {
        return  studentMap.values();
    }
}
