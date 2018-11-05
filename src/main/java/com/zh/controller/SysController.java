package com.zh.controller;

import com.zh.entity.Manager;
import com.zh.entity.Sysparams;
import com.zh.entity.User;
import com.zh.service.ManagerService;
import com.zh.service.SysparamsService;
import com.zh.service.UserService;
import com.zh.util.MD5;
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
@RequestMapping("system")
public class SysController {

    private static Logger logger = Logger.getLogger(SysController.class);

    @Autowired
    private SysparamsService sysparamsService;



    /**
     * 会员管理
     * @return
     */
    @RequestMapping(value = "getSysparamsList", method = {RequestMethod.GET})
    public String getUserList(Sysparams sysparams, Map<String, Object> map, Integer page, Integer rows) {
        Map<Object, Object> param = new HashMap();
        Map<Object, Object> params = new HashMap();
        page = page == null ? 0 : page;
        rows = rows == null ? 10 : rows;
        param.put("firstResult", page * rows);
        param.put("maxResult", rows);
        param.put("keyname", sysparams.getKeyname());
        params.put("keyname", sysparams.getKeyname());
        map.put("keyname", sysparams.getKeyname());
        List<Sysparams> list = sysparamsService.selectPaging(param);
        Integer count = sysparamsService.selectCount(params);
        map.put("data", list);
        map.put("count", count);
        map.put("page", page);
        map.put("rows",rows);
        return "system/sys-list";
    }

    /**
     * 删除
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "delSysparams", method = {RequestMethod.POST})
    public String delUser(Sysparams sysparams) {
        sysparamsService.deleteByPrimaryKey(sysparams.getId());
        return "true";
    }
    @ResponseBody
    @RequestMapping(value = "updateSyaparams", method = {RequestMethod.POST})
    public String updateUser(Sysparams sysparams) throws Exception{
        sysparamsService.updateByPrimaryKeySelective(sysparams);
        return "true";
    }
    @ResponseBody
    @RequestMapping(value = "updateSysparamOnoff", method = {RequestMethod.POST})
    public String updateSysparamOnoff(Integer id) throws Exception{
        Sysparams sysparams = sysparamsService.selectByPrimaryKey(id);
        sysparams.setKeyval(String.valueOf(1 - Integer.valueOf(sysparams.getKeyval())));
        sysparamsService.updateByPrimaryKeySelective(sysparams);
        return "true";
    }
    @ResponseBody
    @RequestMapping(value = "addSysparams", method = {RequestMethod.POST})
    public String addUser(Sysparams sysparams) throws Exception {
        if(sysparams.getType() == 0){
            sysparams.setKeyval("0");
        }
        sysparamsService.insertSelective(sysparams);
        return "true";
    }
    @RequestMapping(value = "querySysparamsById", method = {RequestMethod.GET})
    public String queryUserById(Integer id, Map<String, Object> map) {
        Sysparams sysparams = sysparamsService.selectByPrimaryKey(id);
        map.put("sysparams", sysparams);
        return "true";
    }
    @RequestMapping(value = "toAddSysparams", method = {RequestMethod.GET})
    public String toAddUser() {
        return "system/sys-add";
    }

    @RequestMapping(value = "toUpdateSysparams", method = {RequestMethod.GET})
    public String toUpdateUser(Integer id, Map<String, Object> map) {
        Sysparams sysparams = sysparamsService.selectByPrimaryKey(id);
        map.put("sysparams", sysparams);
        return "system/sys-update";
    }

}
