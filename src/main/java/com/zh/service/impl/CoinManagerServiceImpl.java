package com.zh.service.impl;

import com.zh.dao.CoinManagerMapper;
import com.zh.entity.CoinManager;
import com.zh.service.CoinManagerService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2018-10-31 15:30:37
 **/ 
@Service("coinManagerService")
public class CoinManagerServiceImpl implements CoinManagerService {
    @Resource
    private CoinManagerMapper coinManagerMapper;

    private static final Logger logger = LoggerFactory.getLogger(CoinManagerServiceImpl.class);

    @Override
    public int insert(CoinManager record) {
        return this.coinManagerMapper.insert(record);
    }

    @Override
    public int insertSelective(CoinManager record) {
        return this.coinManagerMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(CoinManager record) {
        return this.coinManagerMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(CoinManager record) {
        return this.coinManagerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.coinManagerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CoinManager selectByPrimaryKey(Integer id) {
        return this.coinManagerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CoinManager> selectAll(Map<Object, Object> param) {
        return this.coinManagerMapper.selectAll(param);
    }

    @Override
    public List<CoinManager> selectPaging(Map<Object, Object> param) {
        return this.coinManagerMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.coinManagerMapper.selectCount(param);
    }
}