package com.zlm.business.controller;

import com.zlm.business.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate ;

    @Autowired
    private UserFeign userFeign ;


    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable String str) {
        // 使用服务名请求服务提供者
        return restTemplate.getForObject("http://provider/echo/" + str, String.class);
    }

    @GetMapping(value = "/user/json")
    public String json() {
        // 使用服务名请求服务提供者
        return restTemplate.getForObject("http://provider/user/json", String.class);
    }

    @GetMapping(value = "/user/test")
    public String test(@RequestParam String message) {
        // 使用服务名请求服务提供者
        return restTemplate.getForObject("http://provider/user/test?message=" + message, String.class);
    }
    
    @GetMapping(value = "/feign/json")
    public String jsonFeign() {
        String json = userFeign.json();
        return json ;
    }

    @GetMapping(value = "/feign/test")
    public String testFeign(@RequestParam String message) {
        return userFeign.test(message);
    }




}
