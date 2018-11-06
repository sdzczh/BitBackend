package com.zh.service.impl;

import com.zh.dao.LogAdminloginMapper;
import com.zh.entity.LogAdminlogin;
import com.zh.service.LogAdminloginService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2018-11-05 16:20:02
 **/ 
@Service("logAdminloginService")
public class LogAdminloginServiceImpl implements LogAdminloginService {
    @Resource
    private LogAdminloginMapper logAdminloginMapper;

    private static final Logger logger = LoggerFactory.getLogger(LogAdminloginServiceImpl.class);

    @Override
    public int insert(LogAdminlogin record) {
        return this.logAdminloginMapper.insert(record);
    }

    @Override
    public int insertSelective(LogAdminlogin record) {
        return this.logAdminloginMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(LogAdminlogin record) {
        return this.logAdminloginMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(LogAdminlogin record) {
        return this.logAdminloginMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.logAdminloginMapper.deleteByPrimaryKey(id);
    }

    @Override
    public LogAdminlogin selectByPrimaryKey(Integer id) {
        return this.logAdminloginMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<LogAdminlogin> selectAll(Map<Object, Object> param) {
        return this.logAdminloginMapper.selectAll(param);
    }

    @Override
    public List<LogAdminlogin> selectPaging(Map<Object, Object> param) {
        return this.logAdminloginMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.logAdminloginMapper.selectCount(param);
    }
}