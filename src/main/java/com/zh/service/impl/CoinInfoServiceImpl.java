package com.zh.service.impl;

import com.zh.dao.CoinInfoMapper;
import com.zh.entity.CoinInfo;
import com.zh.service.CoinInfoService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-04 20:29:24
 **/ 
@Service("coinInfoService")
public class CoinInfoServiceImpl implements CoinInfoService {
    @Resource
    private CoinInfoMapper coinInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(CoinInfoServiceImpl.class);

    @Override
    public int insert(CoinInfo record) {
        return this.coinInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(CoinInfo record) {
        return this.coinInfoMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(CoinInfo record) {
        return this.coinInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(CoinInfo record) {
        return this.coinInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.coinInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CoinInfo selectByPrimaryKey(Integer id) {
        return this.coinInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CoinInfo> selectAll(Map<Object, Object> param) {
        return this.coinInfoMapper.selectAll(param);
    }

    @Override
    public List<CoinInfo> selectPaging(Map<Object, Object> param) {
        return this.coinInfoMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.coinInfoMapper.selectCount(param);
    }
    @Override
    public List<Map<String, Object>> selectInfoPaging(Map<Object, Object> param) {
        return this.coinInfoMapper.selectInfoPaging(param);
    }

}