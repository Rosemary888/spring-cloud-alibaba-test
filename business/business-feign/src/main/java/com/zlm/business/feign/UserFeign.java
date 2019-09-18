package com.zlm.business.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider")
public interface UserFeign {
    @GetMapping(value = "/user/test")
    public String test(@RequestParam(value = "message") String message);

    @GetMapping(value = "/user/json")
    public String json();

}
