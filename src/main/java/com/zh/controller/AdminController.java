package com.zh.controller;

import com.zh.entity.Manager;
import com.zh.entity.User;
import com.zh.service.ManagerService;
import com.zh.util.MD5;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("admin")
public class AdminController {

    private static Logger logger = Logger.getLogger(AdminController.class);

    @Autowired
    private ManagerService managerService;

    /**
     * 会员管理
     * @return
     */
    @RequestMapping(value = "getAdminList", method = {RequestMethod.GET})
    public String getUserList(Manager manager, Map<String, Object> map) {
        Map<Object, Object> param = new HashMap();
        List<Manager> list = managerService.selectAll(param);
        map.put("data", list);
        return "admin/admin-list";
    }


    @ResponseBody
    @RequestMapping(value = "updateAdmin", method = {RequestMethod.POST})
    public String updateUser(Manager manager) throws Exception{
        manager.setPassword(MD5.getMd5(manager.getPassword()));
        managerService.updateByPrimaryKeySelective(manager);
        return "true";
    }
    @RequestMapping(value = "toUpdateAdmin", method = {RequestMethod.GET})
    public String toUpdateUser(Integer id, Map<String, Object> map) {
        Manager manager = managerService.selectByPrimaryKey(id);
        map.put("manager", manager);
        return "admin/admin-update";
    }

}
