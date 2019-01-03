package com.zh.service.impl;

import com.zh.dao.SuperOrderMapper;
import com.zh.entity.SuperOrder;
import com.zh.service.SuperOrderService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-03 14:54:05
 **/ 
@Service("superOrderService")
public class SuperOrderServiceImpl implements SuperOrderService {
    @Resource
    private SuperOrderMapper superOrderMapper;

    private static final Logger logger = LoggerFactory.getLogger(SuperOrderServiceImpl.class);

    @Override
    public int insert(SuperOrder record) {
        return this.superOrderMapper.insert(record);
    }

    @Override
    public int insertSelective(SuperOrder record) {
        return this.superOrderMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(SuperOrder record) {
        return this.superOrderMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(SuperOrder record) {
        return this.superOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.superOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SuperOrder selectByPrimaryKey(Integer id) {
        return this.superOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SuperOrder> selectAll(Map<Object, Object> param) {
        return this.superOrderMapper.selectAll(param);
    }

    @Override
    public List<SuperOrder> selectPaging(Map<Object, Object> param) {
        return this.superOrderMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.superOrderMapper.selectCount(param);
    }
}