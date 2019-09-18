package com.zlm.business.invoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients("com.zlm.business.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class BusinessInvokeApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessInvokeApplication.class,args);
    }
}
