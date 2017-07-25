package controller;

import dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import validation.UserValidation;


/**
 * Created by cdn on 17/7/25.
 */
@Controller
public class UserController {

    @InitBinder
    public void initBinder(DataBinder binder){
        binder.setValidator(new UserValidation());
    }

    @RequestMapping("/test")
    public String test(@Validated User user, BindingResult result){
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
