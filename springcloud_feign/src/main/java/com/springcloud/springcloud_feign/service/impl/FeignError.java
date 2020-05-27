package com.springcloud.springcloud_feign.service.impl;

import com.springcloud.springcloud_feign.entity.Student;
import com.springcloud.springcloud_feign.service.FeignService;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @ProjectName: eurekaserver
 * @Package: com.springcloud.springcloud_feign.service.impl
 * @ClassName: FeignError
 * @Author: ggx
 * @Description:
 * @Date: 2020/5/26 0026 9:48
 * @Version: 1.0
 */
@Component
public class FeignError implements FeignService {
    @Override
    public Collection<Student> finAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中........";
    }
}
