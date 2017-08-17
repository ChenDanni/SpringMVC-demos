package com.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cdn on 17/8/15.
 */
@Controller
public class ResourceController {
    //admin可以访问
    @RequiresRoles("admin")
    @RequestMapping(value = "/resources",method = RequestMethod.GET)
    public String getResources(){
        return "resources";
    }
}
