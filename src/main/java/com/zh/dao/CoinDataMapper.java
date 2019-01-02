package com.zh.dao;

import com.zh.entity.CoinData;
import java.util.List;
import java.util.Map;

public interface CoinDataMapper {
    int insert(CoinData record);

    int insertSelective(CoinData record);

    int updateByPrimaryKey(CoinData record);

    int updateByPrimaryKeySelective(CoinData record);

    int deleteByPrimaryKey(Integer id);

    CoinData selectByPrimaryKey(Integer id);

    List<CoinData> selectAll(Map<Object, Object> param);

    List<CoinData> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}