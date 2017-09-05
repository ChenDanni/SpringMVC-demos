package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by cdn on 17/9/4.
 */
@RestController
@RequestMapping(value = "/api/messages")
public class MainController {

    @RequestMapping(value = "/{message}", method = RequestMethod.GET)
    public String getMessage(HttpServletResponse response, @PathVariable String message){
        response.addHeader("Access-Control-Allow-Origin","*");
        return "hhh";
    }

}
