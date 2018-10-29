package com.zh.service.impl;

import com.zh.dao.ManagerMapper;
import com.zh.entity.Manager;
import com.zh.service.ManagerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

import com.zh.util.MD5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2018-10-29 16:01:58
 **/ 
@Service("managerService")
public class ManagerServiceImpl implements ManagerService {
    @Resource
    private ManagerMapper managerMapper;

    private static final Logger logger = LoggerFactory.getLogger(ManagerServiceImpl.class);

    @Override
    public int insert(Manager record) {
        return this.managerMapper.insert(record);
    }

    @Override
    public int insertSelective(Manager record) {
        return this.managerMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Manager record) {
        return this.managerMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Manager record) {
        return this.managerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.managerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Manager selectByPrimaryKey(Integer id) {
        return this.managerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Manager> selectAll(Map<Object, Object> param) {
        return this.managerMapper.selectAll(param);
    }

    @Override
    public List<Manager> selectPaging(Map<Object, Object> param) {
        return this.managerMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.managerMapper.selectCount(param);
    }

    @Override
    public Manager login(Manager manager) {
        Map<Object, Object> param = new HashMap<Object, Object>();
        try {
            param.put("account", manager.getAccount());
            param.put("password", MD5.getMd5(manager.getPassword()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Manager> list = selectAll(param);
        return list == null || list.size() == 0 ? null : list.get(0);
    }
}