package com.zh.service.impl;

import com.zh.dao.LogUserloginMapper;
import com.zh.entity.LogUserlogin;
import com.zh.service.LogUserloginService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2018-11-05 16:20:23
 **/ 
@Service("logUserloginService")
public class LogUserloginServiceImpl implements LogUserloginService {
    @Resource
    private LogUserloginMapper logUserloginMapper;

    private static final Logger logger = LoggerFactory.getLogger(LogUserloginServiceImpl.class);

    @Override
    public int insert(LogUserlogin record) {
        return this.logUserloginMapper.insert(record);
    }

    @Override
    public int insertSelective(LogUserlogin record) {
        return this.logUserloginMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(LogUserlogin record) {
        return this.logUserloginMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(LogUserlogin record) {
        return this.logUserloginMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.logUserloginMapper.deleteByPrimaryKey(id);
    }

    @Override
    public LogUserlogin selectByPrimaryKey(Integer id) {
        return this.logUserloginMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<LogUserlogin> selectAll(Map<Object, Object> param) {
        return this.logUserloginMapper.selectAll(param);
    }

    @Override
    public List<LogUserlogin> selectPaging(Map<Object, Object> param) {
        return this.logUserloginMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.logUserloginMapper.selectCount(param);
    }
}