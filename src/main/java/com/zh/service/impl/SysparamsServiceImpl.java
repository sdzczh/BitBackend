package com.zh.service.impl;

import com.zh.dao.SysparamsMapper;
import com.zh.entity.Sysparams;
import com.zh.service.SysparamsService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 业务逻辑实现类:系统参数 sysparams
 * 
 * @author: autogeneration
 * @date: 2018-11-05 11:13:25
 **/ 
@Service("sysparamsService")
public class SysparamsServiceImpl implements SysparamsService {
    @Resource
    private SysparamsMapper sysparamsMapper;

    private static final Logger logger = LoggerFactory.getLogger(SysparamsServiceImpl.class);

    @Override
    public int insert(Sysparams record) {
        return this.sysparamsMapper.insert(record);
    }

    @Override
    public int insertSelective(Sysparams record) {
        return this.sysparamsMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Sysparams record) {
        return this.sysparamsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Sysparams record) {
        return this.sysparamsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.sysparamsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Sysparams selectByPrimaryKey(Integer id) {
        return this.sysparamsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Sysparams> selectAll(Map<Object, Object> param) {
        return this.sysparamsMapper.selectAll(param);
    }

    @Override
    public List<Sysparams> selectPaging(Map<Object, Object> param) {
        return this.sysparamsMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.sysparamsMapper.selectCount(param);
    }
}