package com.zh.service.impl;

import com.zh.dao.LogAdminoperMapper;
import com.zh.entity.LogAdminoper;
import com.zh.service.LogAdminoperService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2018-11-05 16:20:13
 **/ 
@Service("logAdminoperService")
public class LogAdminoperServiceImpl implements LogAdminoperService {
    @Resource
    private LogAdminoperMapper logAdminoperMapper;

    private static final Logger logger = LoggerFactory.getLogger(LogAdminoperServiceImpl.class);

    @Override
    public int insert(LogAdminoper record) {
        return this.logAdminoperMapper.insert(record);
    }

    @Override
    public int insertSelective(LogAdminoper record) {
        return this.logAdminoperMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(LogAdminoper record) {
        return this.logAdminoperMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(LogAdminoper record) {
        return this.logAdminoperMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.logAdminoperMapper.deleteByPrimaryKey(id);
    }

    @Override
    public LogAdminoper selectByPrimaryKey(Integer id) {
        return this.logAdminoperMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<LogAdminoper> selectAll(Map<Object, Object> param) {
        return this.logAdminoperMapper.selectAll(param);
    }

    @Override
    public List<LogAdminoper> selectPaging(Map<Object, Object> param) {
        return this.logAdminoperMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.logAdminoperMapper.selectCount(param);
    }
}