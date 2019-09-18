package com.zlm.business.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("user")
public class TestController {

    @Autowired
    private RestTemplate restTemplate ;


    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable String str) {
        // 使用服务名请求服务提供者
        return restTemplate.getForObject("http://provider/echo/" + str, String.class);
    }

    @GetMapping(value = "json")
    public String json() {
        // 使用服务名请求服务提供者
        return restTemplate.getForObject("http://provider/user/json", String.class);
    }

    @GetMapping(value = "test")
    public String test(@RequestParam String message) {
        // 使用服务名请求服务提供者
        return restTemplate.getForObject("http://provider/user/test?message=" + message, String.class);
    }



}
