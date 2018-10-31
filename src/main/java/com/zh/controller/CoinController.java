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
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
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
        param.put("symbol", coinManager.getSymbol());
        params.put("name", coinManager.getName());
        params.put("symbol", coinManager.getSymbol());
        List<CoinManager> list = coinManagerService.selectPaging(param);
        Integer count = coinManagerService.selectCount(params);
        map.put("data", list);
        map.put("count", count);
        map.put("page", page);
        map.put("rows",rows);
        map.put("name",coinManager.getName());
        map.put("symbol", coinManager.getSymbol());
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
    public String updateUser(@RequestParam("file") CommonsMultipartFile file, CoinManager coinManager) throws IOException{
        String path="E:/"+new Date().getTime()+file.getOriginalFilename();
        coinManager.setLogoUrl(path);
        File newFile=new File(path);
        file.transferTo(newFile);
        coinManagerService.updateByPrimaryKeySelective(coinManager);
        return "<center>SUCCESS</center>";
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
 @RequestMapping(value = "toa", method = {RequestMethod.GET})
    public String toa() {
        return "coin/a";
    }

    @RequestMapping(value = "toUpdateCoin", method = {RequestMethod.GET})
    public String toUpdateUser(Integer id, Map<String, Object> map) {
        CoinManager coinManager = coinManagerService.selectByPrimaryKey(id);
        map.put("coin", coinManager);
        return "coin/coin-update";
    }
    @ResponseBody
    @RequestMapping("addCoin")
    public String  fileUpload2(@RequestParam("file") CommonsMultipartFile file, CoinManager coinManager) throws IOException {
        String path="E:/"+new Date().getTime()+file.getOriginalFilename();
        coinManager.setLogoUrl(path);
        File newFile=new File(path);
        file.transferTo(newFile);
        coinManagerService.insertSelective(coinManager);
        return "<center>SUCCESS</center>";
    }
}
