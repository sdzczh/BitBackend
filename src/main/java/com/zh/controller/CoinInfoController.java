package com.zh.controller;

import com.zh.entity.Coin;
import com.zh.entity.CoinInfo;
import com.zh.entity.CoinManager;
import com.zh.entity.LogAdminoper;
import com.zh.service.CoinInfoService;
import com.zh.service.LogAdminoperService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("coin")
public class CoinInfoController {

    private static Logger logger = Logger.getLogger(CoinInfoController.class);

    @Autowired
    private CoinInfoService coinInfoService;
    @Autowired
    private LogAdminoperService logAdminoperService;

    /**
     * 币种信息管理
     * @return
     */
        @RequestMapping(value = "getCoinInfoList", method = {RequestMethod.GET})
    public String getUserList(Coin coin, Map<String, Object> map, Integer page, Integer rows, String symbol) {
        Map<Object, Object> param = new HashMap();
        Map<Object, Object> params = new HashMap();
        page = page == null ? 0 : page;
        rows = rows == null ? 10 : rows;
        param.put("firstResult", page * rows);
        param.put("maxResult", rows);
        param.put("symbol", symbol);
        params.put("symbol", symbol);
        List<Map<String, Object>> list = coinInfoService.selectInfoPaging(param);
        Integer count = coinInfoService.selectCount(params);
        map.put("data", list);
        map.put("count", count);
        map.put("page", page);
        map.put("rows",rows);
        map.put("symbol",symbol);
        return "coinInfo/coin-list";
    }

    /**
     * 删除
     */
    @ResponseBody
    @RequestMapping(value = "delCoinInfo", method = {RequestMethod.POST})
    public String delUser(CoinInfo coinManager, HttpSession session) {
        Object adminName = session.getAttribute("adminName");
        if(adminName == null){
            return "false";
        }
        logAdminoperService.insertLog(adminName.toString(), coinManager.getId(), "删除币种");
        coinInfoService.deleteByPrimaryKey(coinManager.getId());
        return "true";
    }
    @ResponseBody
    @RequestMapping(value = "updateCoinInfo", method = {RequestMethod.POST})
    public String updateUser(CoinInfo coinManager, HttpSession session){
        Object adminName = session.getAttribute("adminName");
        if(adminName == null){
            return "false";
        }
        logAdminoperService.insertLog(adminName.toString(), coinManager.getId(), "更新币种");
        coinInfoService.updateByPrimaryKeySelective(coinManager);
        return "<center>SUCCESS</center>";
    }
    @RequestMapping(value = "queryCoinInfoById", method = {RequestMethod.GET})
    public String queryUserById(Integer id, Map<String, Object> map) {
        CoinInfo coinManager = coinInfoService.selectByPrimaryKey(id);
        map.put("coinInfo", coinManager);
        return "true";
    }
    @RequestMapping(value = "toAddCoinInfo", method = {RequestMethod.GET})
    public String toAddUser() {
        return "coinInfo/coin-add";
    }

    @RequestMapping(value = "toUpdateCoinInfo", method = {RequestMethod.GET})
    public String toUpdateUser(Integer id, Map<String, Object> map, String symbol) {
        CoinInfo coinManager = coinInfoService.selectByPrimaryKey(id);
        map.put("coin", coinManager);
        map.put("symbol", symbol);
        return "coinInfo/coin-update";
    }
    @ResponseBody
    @RequestMapping("addCoinInfo")
    public String  fileUpload2(CoinInfo coinManager, HttpSession session){
        Object adminName = session.getAttribute("adminName");
        if(adminName == null){
            return "false";
        }
        logAdminoperService.insertLog(adminName.toString(), coinManager.getId(), "添加币种");
        coinInfoService.insertSelective(coinManager);
        return "<center>SUCCESS</center>";
    }
}
