package com.zh.controller;

import com.zh.dto.Admin;
import com.zh.dto.User;
import com.zh.service.AdminService;
import com.zh.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private AdminService adminService;


    @RequestMapping(value = "/helloworld", method = {RequestMethod.GET, RequestMethod.POST})
    public Object helloworld() {
        logger.info("hello world================================");
        return "/index";
    }
    @ResponseBody
    @RequestMapping(value = "/findUser", method = {RequestMethod.GET, RequestMethod.POST})
    public User findUser(Integer id) {
        return userService.findUser(id);
    }

    @ResponseBody
    @RequestMapping(value = "/findAdmin", method = {RequestMethod.GET, RequestMethod.POST})
    public Admin findAdmin(Integer id) {
        return adminService.findAdmin(id);
    }





}
