package com.springcloud.springcloud_feign.controller;

import com.springcloud.springcloud_feign.service.FeignService;
import com.springcloud.springcloud_feign.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("feign")
public class RibbonController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/finAll")
    public Collection<Student> findAll() {
        return feignService.finAll();
    }

    @RequestMapping("/index")
    public String index() {
        return feignService.index();
    }


}
