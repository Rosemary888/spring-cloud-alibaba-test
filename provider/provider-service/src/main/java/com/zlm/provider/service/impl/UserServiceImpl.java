package com.zlm.provider.service.impl;

import com.zlm.provider.api.domain.User;
import com.zlm.provider.api.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public String saHai(String massage) {
        return "Provider: this is a test ："+massage;
    }

    @Override
    public User getJson() {
        User user = new User();
        user.setId(1L);
        user.setPassword("147258");
        user.setUsername("tom");
        return user;
    }
}
