package com.springcloud.ribbon.controller;

import com.springcloud.ribbon.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @ProjectName: eurekaserver
 * @Package: com.springcloud.ribbon
 * @ClassName: RibbonController
 * @Author: ggx
 * @Description:
 * @Date: 2020/5/26 0026 8:43
 * @Version: 1.0
 */

@RestController
@RequestMapping("ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/finAll")
    public Collection<Student> findAll() {
            return restTemplate.getForObject("http://provider/provider/finAll", Collection.class);
    }

    @RequestMapping("/index")
    public String index() {
        System.out.println("1123");
        return restTemplate.getForObject("http://provider/provider/index", String.class);
    }


}
