package com.zh.service.impl;

import com.zh.dao.CoinPriceMapper;
import com.zh.entity.CoinPrice;
import com.zh.service.CoinPriceService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-02 16:52:40
 **/ 
@Service("coinPriceService")
public class CoinPriceServiceImpl implements CoinPriceService {
    @Resource
    private CoinPriceMapper coinPriceMapper;

    private static final Logger logger = LoggerFactory.getLogger(CoinPriceServiceImpl.class);

    @Override
    public int insert(CoinPrice record) {
        return this.coinPriceMapper.insert(record);
    }

    @Override
    public int insertSelective(CoinPrice record) {
        return this.coinPriceMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(CoinPrice record) {
        return this.coinPriceMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(CoinPrice record) {
        return this.coinPriceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.coinPriceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CoinPrice selectByPrimaryKey(Integer id) {
        return this.coinPriceMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CoinPrice> selectAll(Map<Object, Object> param) {
        return this.coinPriceMapper.selectAll(param);
    }

    @Override
    public List<CoinPrice> selectPaging(Map<Object, Object> param) {
        return this.coinPriceMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.coinPriceMapper.selectCount(param);
    }
}