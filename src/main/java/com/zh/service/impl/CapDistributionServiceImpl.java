package com.zh.service.impl;

import com.zh.dao.CapDistributionMapper;
import com.zh.entity.CapDistribution;
import com.zh.service.CapDistributionService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-04 20:05:25
 **/ 
@Service("capDistributionService")
public class CapDistributionServiceImpl implements CapDistributionService {
    @Resource
    private CapDistributionMapper capDistributionMapper;

    private static final Logger logger = LoggerFactory.getLogger(CapDistributionServiceImpl.class);

    @Override
    public int insert(CapDistribution record) {
        return this.capDistributionMapper.insert(record);
    }

    @Override
    public int insertSelective(CapDistribution record) {
        return this.capDistributionMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(CapDistribution record) {
        return this.capDistributionMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(CapDistribution record) {
        return this.capDistributionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.capDistributionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CapDistribution selectByPrimaryKey(Integer id) {
        return this.capDistributionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CapDistribution> selectAll(Map<Object, Object> param) {
        return this.capDistributionMapper.selectAll(param);
    }

    @Override
    public List<CapDistribution> selectPaging(Map<Object, Object> param) {
        return this.capDistributionMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.capDistributionMapper.selectCount(param);
    }
}