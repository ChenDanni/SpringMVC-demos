package com.service;

import com.annotation.AOPAnnotation;
import org.springframework.stereotype.Service;

/**
 * Created by cdn on 2017/9/14.
 */
@Service
public class UserService {

    @AOPAnnotation(methodName = "userService")
    public void userHandle(){
        System.out.println("in com.service");
    }

}
