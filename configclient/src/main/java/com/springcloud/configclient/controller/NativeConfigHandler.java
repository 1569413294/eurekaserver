package com.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: eurekaserver
 * @Package: com.springcloud.configclient.controller
 * @ClassName: NativeConfigHandler
 * @Author: ggx
 * @Description:
 * @Date: 2020/5/27 0027 9:34
 * @Version: 1.0
 */
@RestController("configServer")
public class NativeConfigHandler {

    @Value("${server.port}")
    private  String port;

    @Value("${foo}")
    private  String foo;

    @RequestMapping("index1")
    public String index1(){
        return this.port+"-"+this.foo;
    }

}
