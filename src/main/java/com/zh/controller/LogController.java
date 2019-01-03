package com.zh.controller;

import com.zh.entity.*;
import com.zh.service.*;
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
    @Autowired
    private OkexDealRecordService okexDealRecordService;



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
    /**
     * 资金分布
     * @return
     */
    @RequestMapping(value = "getOKDealList", method = {RequestMethod.GET}, produces="text/html;charset=UTF-8")
    public String getOKDealList(OkexDealRecord okexDealRecord, Map<String, Object> map, Integer page, Integer rows) {
        Map<Object, Object> param = new HashMap();
        Map<Object, Object> params = new HashMap();
        page = page == null ? 0 : page;
        rows = rows == null ? 10 : rows;
        param.put("firstResult", page * rows);
        param.put("maxResult", rows);
        param.put("coinid", okexDealRecord.getId());
        List<OkexDealRecord> list = okexDealRecordService.selectPaging(param);
        Integer count = okexDealRecordService.selectCount(params);
        map.put("data", list);
        map.put("count", count);
        map.put("page", page);
        map.put("rows",rows);
        return "log/OkexDeal";
    }
}
