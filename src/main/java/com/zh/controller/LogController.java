package com.zh.controller;

import com.zh.entity.LogAdminlogin;
import com.zh.entity.LogAdminoper;
import com.zh.entity.LogUserlogin;
import com.zh.entity.Sysparams;
import com.zh.service.LogAdminloginService;
import com.zh.service.LogAdminoperService;
import com.zh.service.LogUserloginService;
import com.zh.service.SysparamsService;
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
@RequestMapping("log")
public class LogController {

    private static Logger logger = Logger.getLogger(LogController.class);

    @Autowired
    private LogAdminloginService logAdminloginService;
    @Autowired
    private LogAdminoperService logAdminoperService;
    @Autowired
    private LogUserloginService logUserloginService;



    /**
     * 后台登陆日志
     * @return
     */
    @RequestMapping(value = "getBackloginLogList", method = {RequestMethod.GET})
    public String getBackloginLogList(LogAdminlogin logAdminlogin, Map<String, Object> map, Integer page, Integer rows, String datemin, String datemax) {
        Map<Object, Object> param = new HashMap();
        Map<Object, Object> params = new HashMap();
        page = page == null ? 0 : page;
        rows = rows == null ? 10 : rows;
        param.put("firstResult", page * rows);
        param.put("maxResult", rows);
        param.put("datemin", datemin);
        param.put("datemax", datemax);
        params.put("datemin", datemin);
        params.put("datemax", datemax);
        List<LogAdminlogin> list = logAdminloginService.selectPaging(param);
        Integer count = logAdminloginService.selectCount(params);
        map.put("data", list);
        map.put("count", count);
        map.put("page", page);
        map.put("rows",rows);
        return "log/adminLogin";
    }
    /**
     * 用户登陆日志
     * @return
     */
    @RequestMapping(value = "getUserloginLogList", method = {RequestMethod.GET})
    public String getUserloginLogList(LogUserlogin logUserlogin, Map<String, Object> map, Integer page, Integer rows, String datemin, String datemax) {
        Map<Object, Object> param = new HashMap();
        Map<Object, Object> params = new HashMap();
        page = page == null ? 0 : page;
        rows = rows == null ? 10 : rows;
        param.put("firstResult", page * rows);
        param.put("maxResult", rows);
        param.put("datemin", datemin);
        param.put("datemax", datemax);
        params.put("datemin", datemin);
        params.put("datemax", datemax);
        List<LogUserlogin> list = logUserloginService.selectPaging(param);
        Integer count = logUserloginService.selectCount(params);
        map.put("data", list);
        map.put("count", count);
        map.put("page", page);
        map.put("rows",rows);
        return "log/userLogin";
    }
    /**
     * 后台操作日志
     * @return
     */
    @RequestMapping(value = "getBackLogList", method = {RequestMethod.GET},produces="text/html;charset=UTF-8")
    public String getBackLogList(LogAdminoper logAdminoper, Map<String, Object> map, Integer page, Integer rows, String datemin, String datemax) {
        Map<Object, Object> param = new HashMap();
        Map<Object, Object> params = new HashMap();
        page = page == null ? 0 : page;
        rows = rows == null ? 10 : rows;
        param.put("firstResult", page * rows);
        param.put("maxResult", rows);
        param.put("datemin", datemin);
        param.put("datemax", datemax);
        params.put("datemin", datemin);
        params.put("datemax", datemax);
        param.put("oper", logAdminoper.getOper());
        params.put("oper", logAdminoper.getOper());
        map.put("oper", logAdminoper.getOper() );
        List<LogAdminoper> list = logAdminoperService.selectPaging(param);
        Integer count = logAdminoperService.selectCount(params);
        map.put("data", list);
        map.put("count", count);
        map.put("page", page);
        map.put("rows",rows);
        return "log/adminOper";
    }
}
