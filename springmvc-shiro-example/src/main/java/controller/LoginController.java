package controller;

import dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.LoginService;


/**
 * Created by cdn on 17/7/25.
 */
@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(User user){
        if (loginService.login(user)){
            return "index";
        }else {
            return "login";
        }
    }

}
