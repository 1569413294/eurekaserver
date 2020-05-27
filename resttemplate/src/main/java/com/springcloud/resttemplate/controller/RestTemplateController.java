package com.springcloud.resttemplate.controller;

import com.springcloud.resttemplate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @ProjectName: eurekaserver
 * @Package: com.springcloud.resttemplate.controller
 * @ClassName: RestTemplateController
 * @Author: ggx
 * @Description:
 * @Date: 2020/5/25 0025 9:38
 * @Version: 1.0
 */
@RestController
@RequestMapping("RestTemplate")
public class RestTemplateController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("finAll")
    public Collection<Student> finAll(){
        return restTemplate.getForObject("http://localhost:2222/provider/finAll",
                Collection.class);
    }





}
