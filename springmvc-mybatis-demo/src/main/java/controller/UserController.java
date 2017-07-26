package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserServiceImpl;


/**
 * Created by cdn on 17/7/25.
 */
@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/test2")
    public String test2(){
        System.out.println(userService.selectById(1).getUsername());
        return "index";
    }
}
