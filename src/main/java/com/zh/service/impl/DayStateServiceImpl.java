package com.zh.service.impl;

import com.zh.dao.DayStateMapper;
import com.zh.entity.DayState;
import com.zh.service.DayStateService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-03 10:29:22
 **/ 
@Service("dayStateService")
public class DayStateServiceImpl implements DayStateService {
    @Resource
    private DayStateMapper dayStateMapper;

    private static final Logger logger = LoggerFactory.getLogger(DayStateServiceImpl.class);

    @Override
    public int insert(DayState record) {
        return this.dayStateMapper.insert(record);
    }

    @Override
    public int insertSelective(DayState record) {
        return this.dayStateMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(DayState record) {
        return this.dayStateMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(DayState record) {
        return this.dayStateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.dayStateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public DayState selectByPrimaryKey(Integer id) {
        return this.dayStateMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<DayState> selectAll(Map<Object, Object> param) {
        return this.dayStateMapper.selectAll(param);
    }

    @Override
    public List<DayState> selectPaging(Map<Object, Object> param) {
        return this.dayStateMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.dayStateMapper.selectCount(param);
    }
}