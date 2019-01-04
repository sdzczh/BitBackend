package com.zh.service.impl;

import com.zh.dao.SmsRecordMapper;
import com.zh.entity.SmsRecord;
import com.zh.service.SmsRecordService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-04 21:02:12
 **/ 
@Service("smsRecordService")
public class SmsRecordServiceImpl implements SmsRecordService {
    @Resource
    private SmsRecordMapper smsRecordMapper;

    private static final Logger logger = LoggerFactory.getLogger(SmsRecordServiceImpl.class);

    @Override
    public int insert(SmsRecord record) {
        return this.smsRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsRecord record) {
        return this.smsRecordMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsRecord record) {
        return this.smsRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsRecord record) {
        return this.smsRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.smsRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SmsRecord selectByPrimaryKey(Integer id) {
        return this.smsRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SmsRecord> selectAll(Map<Object, Object> param) {
        return this.smsRecordMapper.selectAll(param);
    }

    @Override
    public List<SmsRecord> selectPaging(Map<Object, Object> param) {
        return this.smsRecordMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.smsRecordMapper.selectCount(param);
    }
}