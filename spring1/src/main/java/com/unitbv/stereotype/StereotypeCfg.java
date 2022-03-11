package com.unitbv.stereotype;

import com.unitbv.stereotype.controller.UserController;
import com.unitbv.stereotype.service.UserService;
import com.unitbv.stereotype.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.unitbv")

public class StereotypeCfg {
    @Bean
    public UserService getBean(){
        UserService userService = new UserServiceImpl();
        return userService;
    }

}
