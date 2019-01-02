package com.zh.controller;

import com.zh.entity.CapDistribution;
import com.zh.entity.Manager;
import com.zh.entity.User;
import com.zh.service.CapDistributionService;
import com.zh.service.ManagerService;
import com.zh.service.impl.CapDistributionServiceImpl;
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
@RequestMapping("count")
public class CountController {

    private static Logger logger = Logger.getLogger(CountController.class);

    @Autowired
    private CapDistributionService capDistributionService;

    /**
     * 资金分布
     * @return
     */
    @RequestMapping(value = "getCapDisList", method = {RequestMethod.GET})
    public String getUserList(CapDistribution capDistribution, Map<String, Object> map, Integer page, Integer rows) {
        Map<Object, Object> param = new HashMap();
        Map<Object, Object> params = new HashMap();
        page = page == null ? 0 : page;
        rows = rows == null ? 10 : rows;
        param.put("firstResult", page * rows);
        param.put("maxResult", rows);
        param.put("coin", capDistribution.getCoin());
        List<CapDistribution> list = capDistributionService.selectPaging(param);
        Integer count = capDistributionService.selectCount(params);
        map.put("data", list);
        map.put("count", count);
        map.put("page", page);
        map.put("rows",rows);
        return "count/capDistribution";
    }


}
