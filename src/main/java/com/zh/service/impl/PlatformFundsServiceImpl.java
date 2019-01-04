package com.zh.service.impl;

import com.zh.dao.PlatformFundsMapper;
import com.zh.entity.PlatformFunds;
import com.zh.service.PlatformFundsService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-04 21:01:51
 **/ 
@Service("platformFundsService")
public class PlatformFundsServiceImpl implements PlatformFundsService {
    @Resource
    private PlatformFundsMapper platformFundsMapper;

    private static final Logger logger = LoggerFactory.getLogger(PlatformFundsServiceImpl.class);

    @Override
    public int insert(PlatformFunds record) {
        return this.platformFundsMapper.insert(record);
    }

    @Override
    public int insertSelective(PlatformFunds record) {
        return this.platformFundsMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(PlatformFunds record) {
        return this.platformFundsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(PlatformFunds record) {
        return this.platformFundsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.platformFundsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PlatformFunds selectByPrimaryKey(Integer id) {
        return this.platformFundsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PlatformFunds> selectAll(Map<Object, Object> param) {
        return this.platformFundsMapper.selectAll(param);
    }

    @Override
    public List<PlatformFunds> selectPaging(Map<Object, Object> param) {
        return this.platformFundsMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.platformFundsMapper.selectCount(param);
    }
}