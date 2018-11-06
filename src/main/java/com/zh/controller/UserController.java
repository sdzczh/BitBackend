package com.zh.controller;

import com.zh.entity.LogAdminlogin;
import com.zh.entity.LogAdminoper;
import com.zh.entity.Manager;
import com.zh.entity.User;
import com.zh.service.LogAdminloginService;
import com.zh.service.LogAdminoperService;
import com.zh.service.ManagerService;
import com.zh.service.UserService;
import com.zh.util.GetIP;
import com.zh.util.MD5;
import com.zh.util.StrUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.net.util.IPAddressUtil;

import javax.servlet.http.HttpServletRequest;
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
    @Autowired
    private LogAdminloginService logAdminloginService;
    @Autowired
    private LogAdminoperService logAdminoperService;

    private static LogAdminoper logAdminoper = new LogAdminoper();

    /**
     * 管理员登录
     * @param manager
     * @param session
     * @return
     */
    @RequestMapping(value = "login", method = {RequestMethod.POST})
    public String helloworld(Manager manager, HttpSession session, HttpServletRequest request) {
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
        session.setAttribute("adminName", "admin");
        session.removeAttribute("result");
        LogAdminlogin logAdminlogin = new LogAdminlogin();
        logAdminlogin.setAccount(manager.getAccount());
        GetIP getIP = new GetIP();
        logAdminlogin.setClientip(getIP.getIpAddr(request));
        logAdminloginService.insertSelective(logAdminlogin);
        return "index";
    }
    @RequestMapping(value = "login", method = {RequestMethod.GET})
    public String toIndex(HttpSession session) {
        String adminName = session.getAttribute("adminName").toString();
        if(StrUtils.isBlank(adminName)){
            return "login";
        }
        return "index";
    }

    /**
     * 会员管理
     * @return
     */
    @RequestMapping(value = "getUserList", method = {RequestMethod.GET})
    public String getUserList(User user, Map<String, Object> map, Integer page, Integer rows) {
        Map<Object, Object> param = new HashMap();
        Map<Object, Object> params = new HashMap();
        page = page == null ? 0 : page;
        rows = rows == null ? 10 : rows;
        param.put("firstResult", page * rows);
        param.put("maxResult", rows);
        param.put("phone", user.getPhone());
        params.put("phone", user.getPhone());
        List<User> list = userService.selectPaging(param);
        Integer count = userService.selectCount(params);
        map.put("data", list);
        map.put("count", count);
        map.put("page", page);
        map.put("rows",rows);
        return "user/user-list";
    }

    /**
     * 删除
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "delUser", method = {RequestMethod.POST})
    public String delUser(User user, HttpSession session) {
        Object adminName = session.getAttribute("adminName");
        if(adminName == null){
             return "false";
        }
        logAdminoperService.insertLog(adminName.toString(), user.getId(), "删除用户");
        userService.deleteByPrimaryKey(user.getId());
        return "true";
    }
    @ResponseBody
    @RequestMapping(value = "updateUser", method = {RequestMethod.POST})
    public String updateUser(User user, HttpSession session) throws Exception{
        Object adminName = session.getAttribute("adminName");
        if(adminName == null){
            return "false";
        }
        logAdminoperService.insertLog(adminName.toString(), user.getId(), "更新用户信息");
        user.setUserpassword(MD5.getMd5(user.getUserpassword()));
        userService.updateByPrimaryKeySelective(user);
        return "true";
    }
    @ResponseBody
    @RequestMapping(value = "addUser", method = {RequestMethod.POST})
    public String addUser(User user, HttpSession session) throws Exception {
        user.setUserpassword(MD5.getMd5(user.getUserpassword()));
        user.setState(new Byte("0"));
        userService.insertSelective(user);
        Object adminName = session.getAttribute("adminName");
        if(adminName == null){
            return "true";
        }
        logAdminoperService.insertLog(adminName.toString(), user.getId(), "添加用户");
        return "true";
    }
    @RequestMapping(value = "queryUserById", method = {RequestMethod.GET})
    public String queryUserById(Integer id, Map<String, Object> map) {
        User user = userService.selectByPrimaryKey(id);
        map.put("user", user);
        return "true";
    }
    @RequestMapping(value = "toAddUser", method = {RequestMethod.GET})
    public String toAddUser() {
        return "user/user-add";
    }

    @RequestMapping(value = "toUpdateUser", method = {RequestMethod.GET})
    public String toUpdateUser(Integer id, Map<String, Object> map) {
        User user = userService.selectByPrimaryKey(id);
        map.put("user", user);
        return "user/user-update";
    }

    /**
     * 管理员退出
     * @param session
     * @return
     */
    @RequestMapping(value="exit",method=RequestMethod.GET)
    public String exit(HttpSession session){
        session.invalidate();
        return "login";
    }


}
