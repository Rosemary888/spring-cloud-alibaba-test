package com.zlm.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 通过 @EnableDiscoveryClient 注解表明是一个 Nacos 客户端，
 * 该注解是 Spring Cloud 提供的原生注解
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderServiceApplication.class,args);
    }
}
