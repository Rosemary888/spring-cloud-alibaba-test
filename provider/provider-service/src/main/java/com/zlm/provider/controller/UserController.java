package com.zlm.provider.controller;

import com.zlm.provider.api.domain.User;
import com.zlm.provider.api.service.IUserService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;
    @GetMapping(value = "test")
    public String test(@RequestParam(value = "message") String message){
        String saHai = userService.saHai(message);
        return saHai ;
    }

    @GetMapping(value = "json")
    public String json(){
        User user = userService.getJson();
        String result= JSONArray.fromObject(user).toString();
        return result ;
    }
}
