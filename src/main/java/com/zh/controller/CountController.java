package com.zh.controller;

import com.zh.entity.*;
import com.zh.service.*;
import com.zh.service.impl.CapDistributionServiceImpl;
import com.zh.util.MD5;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.plugin.services.PlatformService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("count")
public class CountController {

    private static Logger logger = Logger.getLogger(CountController.class);

    @Autowired
    private CapDistributionService capDistributionService;
    @Autowired
    private DayStateService dayStateService;
    @Autowired
    private PlatformFundsService platformFundsService;
    @Autowired
    private SuperOrderService superOrderService;

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
    /**
     * 当日资金变化
     * @return
     */
    @RequestMapping(value = "getDayStateList", method = {RequestMethod.GET})
    public String getDayStateList(DayState dayState, Map<String, Object> map, Integer page, Integer rows) {
        Map<Object, Object> param = new HashMap();
        Map<Object, Object> params = new HashMap();
        page = page == null ? 0 : page;
        rows = rows == null ? 10 : rows;
        param.put("firstResult", page * rows);
        param.put("maxResult", rows);
        param.put("coin", dayState.getCoin());
        List<DayState> list = dayStateService.selectPaging(param);
        Integer count = dayStateService.selectCount(params);
        map.put("data", list);
        map.put("count", count);
        map.put("page", page);
        map.put("rows",rows);
        return "count/dayState";
    }
    /**
     * 平台资金流动
     * @return
     */
    @RequestMapping(value = "getPlantFundsList", method = {RequestMethod.GET})
    public String getPlantFundsList(Map<String, Object> map, Integer page, Integer rows) {
        Map<Object, Object> param = new HashMap();
        Map<Object, Object> params = new HashMap();
        page = page == null ? 0 : page;
        rows = rows == null ? 10 : rows;
        param.put("firstResult", page * rows);
        param.put("maxResult", rows);
        List<PlatformFunds> list = platformFundsService.selectPaging(param);
        Integer count = platformFundsService.selectCount(params);
        map.put("data", list);
        map.put("count", count);
        map.put("page", page);
        map.put("rows",rows);
        return "count/platFunds";
    }

    /**
     * 超级大单列表
     * @return
     */
    @RequestMapping(value = "getSuperOrderList", method = {RequestMethod.GET})
    public String getSuperOrderList(SuperOrder superOrder, Map<String, Object> map, Integer page, Integer rows) {
        Map<Object, Object> param = new HashMap();
        Map<Object, Object> params = new HashMap();
        page = page == null ? 0 : page;
        rows = rows == null ? 10 : rows;
        param.put("firstResult", page * rows);
        param.put("maxResult", rows);
        param.put("coin", superOrder.getCoin());
        List<SuperOrder> list = superOrderService.selectPaging(param);
        Integer count = superOrderService.selectCount(params);
        map.put("data", list);
        map.put("count", count);
        map.put("page", page);
        map.put("rows",rows);
        return "count/superOrder";
    }


}
