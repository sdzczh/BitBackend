package com.xyg.st.controller;

import com.xyg.st.dto.User;
import com.xyg.st.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    @Qualifier("userService")
    private UserService userService;


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




}
