package com.controller;

import com.bean.JsonResponse;
import com.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    MainService mainService;

    @RequestMapping(value = "/{message}", method = RequestMethod.GET)
    public JsonResponse getMessage(HttpServletResponse response, @PathVariable String message){
        response.addHeader("Access-Control-Allow-Origin","*");

        String msg = mainService.getMessage(message);
        JsonResponse ret = new JsonResponse();
        ret.setMessage(msg);

        return ret;
    }

}
