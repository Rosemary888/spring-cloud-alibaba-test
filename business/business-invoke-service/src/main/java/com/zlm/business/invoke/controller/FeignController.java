package com.zlm.business.invoke.controller;


import com.zlm.business.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feign/user")
public class FeignController {

    @Autowired
    private UserFeign userFeign;

    @GetMapping(value = "json")
    public String jsonFeign() {
        String json = userFeign.json();
        return json ;
    }

    @GetMapping(value = "test")
    public String testFeign(@RequestParam String message) {
        return userFeign.test(message);
    }

}
