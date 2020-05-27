package com.springcloud.hystrix.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ProjectName: eurekaserver
 * @Package: com.springcloud.provider
 * @ClassName: entity
 * @Author: ggx
 * @Description:
 * @Date: 2020/5/25 0025 9:16
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private int age;
}
