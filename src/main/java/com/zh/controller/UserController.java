package com.zh.controller;

import com.zh.entity.Manager;
import com.zh.entity.User;
import com.zh.service.ManagerService;
import com.zh.service.UserService;
import com.zh.util.StrUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private ManagerService managerService;

    /**
     * 管理员登录
     * @param manager
     * @param session
     * @return
     */
    @RequestMapping(value = "login", method = {RequestMethod.POST})
    public String helloworld(Manager manager, HttpSession session) {
        if(StrUtils.isBlank(manager.getAccount()) || StrUtils.isBlank(manager.getPassword())){
            session.removeAttribute("result");
            session.setAttribute("result", "用户名或密码不能为空");
            return "login";
        }
        Manager ma = managerService.login(manager);
        if(ma == null){
            session.removeAttribute("result");
            session.setAttribute("result", "用户名或密码错误");
            return "login";
        }
        session.removeAttribute("result");
        return "index";
    }

    /**
     * 会员管理
     * @return
     */
    @RequestMapping(value = "getUserList", method = {RequestMethod.GET})
    public String getUserList(Map<String, Object> map, Integer page, Integer rows) {
        Map<Object, Object> param = new HashMap();
        page = page == null ? 0 : page;
        rows = rows == null ? 10 : rows;
        param.put("firstResult", page * rows);
        param.put("maxResult", rows);
        List<User> list = userService.selectPaging(param);
        map.put("data", list);
        return "user/user-list";
    }



}
