package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by cdn on 17/8/15.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String showLogin(HttpServletRequest request, Model model){
        //get exception
        String exp = (String) request.getAttribute("shiroLoginFailure");
        if (exp != null){
            model.addAttribute("error","login failure");
        }
        return "login";
    }

    @RequestMapping(value = "/success")
    public String loginSuccess(){
        return "loginSuccess";
    }



//    @RequestMapping(value = "/login",method = RequestMethod.POST)
//    public String doLogin(@RequestParam("username") String username, @RequestParam("password") String password){
//        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
//        Subject subject = SecurityUtils.getSubject();
//        try{
//            subject.login(token);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        if (subject.isAuthenticated()){
//            if (subject.hasRole("admin"))
//                return "admin";
//            if (subject.hasRole("user"))
//                return "user";
//        }
//        return "login";
//    }
}
