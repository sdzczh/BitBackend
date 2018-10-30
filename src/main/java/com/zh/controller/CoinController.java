package com.zh.controller;

import com.zh.entity.CoinManager;
import com.zh.entity.Manager;
import com.zh.entity.User;
import com.zh.service.CoinManagerService;
import com.zh.service.ManagerService;
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
@RequestMapping("coin")
public class CoinController {

    private static Logger logger = Logger.getLogger(CoinController.class);

    @Autowired
    private CoinManagerService coinManagerService;

    /**
     * 会员管理
     * @return
     */
    @RequestMapping(value = "getCoinList", method = {RequestMethod.GET})
    public String getUserList(CoinManager coinManager, Map<String, Object> map, Integer page, Integer rows) {
        Map<Object, Object> param = new HashMap();
        Map<Object, Object> params = new HashMap();
        page = page == null ? 0 : page;
        rows = rows == null ? 10 : rows;
        param.put("firstResult", page * rows);
        param.put("maxResult", rows);
        param.put("name", coinManager.getName());
        List<CoinManager> list = coinManagerService.selectPaging(param);
        Integer count = coinManagerService.selectCount(params);
        map.put("data", list);
        map.put("count", count);
        map.put("page", page);
        map.put("rows",rows);
        return "coin/coin-list";
    }

    /**
     * 删除
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "delCoin", method = {RequestMethod.POST})
    public String delUser(CoinManager coinManager) {
        coinManagerService.deleteByPrimaryKey(coinManager.getId());
        return "true";
    }
    @ResponseBody
    @RequestMapping(value = "updateCoin", method = {RequestMethod.POST})
    public String updateUser(CoinManager coinManager) throws Exception{
        coinManagerService.updateByPrimaryKeySelective(coinManager);
        return "true";
    }
    @ResponseBody
    @RequestMapping(value = "addCoin", method = {RequestMethod.POST})
    public String addUser(CoinManager coinManager) throws Exception {
        coinManagerService.insertSelective(coinManager);
        return "true";
    }
    @RequestMapping(value = "queryCoinById", method = {RequestMethod.GET})
    public String queryUserById(Integer id, Map<String, Object> map) {
        CoinManager coinManager = coinManagerService.selectByPrimaryKey(id);
        map.put("coinManager", coinManager);
        return "true";
    }
    @RequestMapping(value = "toAddCoin", method = {RequestMethod.GET})
    public String toAddUser() {
        return "coin/coin-add";
    }

    @RequestMapping(value = "toUpdateCoin", method = {RequestMethod.GET})
    public String toUpdateUser(Integer id, Map<String, Object> map) {
        CoinManager coinManager = coinManagerService.selectByPrimaryKey(id);
        map.put("coin", coinManager);
        return "coin/coin-update";
    }

}
