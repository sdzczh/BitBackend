package com.zh.dao;

import com.zh.entity.CoinPrice;
import java.util.List;
import java.util.Map;

public interface CoinPriceMapper {
    int insert(CoinPrice record);

    int insertSelective(CoinPrice record);

    int updateByPrimaryKey(CoinPrice record);

    int updateByPrimaryKeySelective(CoinPrice record);

    int deleteByPrimaryKey(Integer id);

    CoinPrice selectByPrimaryKey(Integer id);

    List<CoinPrice> selectAll(Map<Object, Object> param);

    List<CoinPrice> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}