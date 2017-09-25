package com.controller;

import com.annotation.AOPAnnotation;
import com.dto.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cdn on 17/7/25.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @AOPAnnotation(methodName = "userController")
    @RequestMapping("/test")
    public String test(User user, BindingResult result){

        userService.userHandle();

        if (result.hasErrors()){
            System.out.println("err");
        }else{
            System.out.println("pass");
        }
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "index";
    }
}
