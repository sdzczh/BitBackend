package com.zh.service.impl;

import com.zh.dao.OkexDealRecordMapper;
import com.zh.entity.OkexDealRecord;
import com.zh.service.OkexDealRecordService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-04 21:01:29
 **/ 
@Service("okexDealRecordService")
public class OkexDealRecordServiceImpl implements OkexDealRecordService {
    @Resource
    private OkexDealRecordMapper okexDealRecordMapper;

    private static final Logger logger = LoggerFactory.getLogger(OkexDealRecordServiceImpl.class);

    @Override
    public int insert(OkexDealRecord record) {
        return this.okexDealRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(OkexDealRecord record) {
        return this.okexDealRecordMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(OkexDealRecord record) {
        return this.okexDealRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(OkexDealRecord record) {
        return this.okexDealRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.okexDealRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public OkexDealRecord selectByPrimaryKey(Integer id) {
        return this.okexDealRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OkexDealRecord> selectAll(Map<Object, Object> param) {
        return this.okexDealRecordMapper.selectAll(param);
    }

    @Override
    public List<OkexDealRecord> selectPaging(Map<Object, Object> param) {
        return this.okexDealRecordMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.okexDealRecordMapper.selectCount(param);
    }
}