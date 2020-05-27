package com.springcloud.springcloud_feign.service;

import com.springcloud.springcloud_feign.entity.Student;
import com.springcloud.springcloud_feign.service.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @ProjectName: eurekaserver
 * @Package: com.springcloud.springcloud_feign
 * @ClassName: FeignService
 * @Author: ggx
 * @Description:
 * @Date: 2020/5/26 0026 9:41
 * @Version: 1.0
 */
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignService {

    @GetMapping("/provider/finAll")
    Collection<Student> finAll();
    @GetMapping("/provider/index")
    String index();


}
