package com.zh.dao;

import com.zh.entity.CoinInfo;
import java.util.List;
import java.util.Map;

public interface CoinInfoMapper {
    int insert(CoinInfo record);

    int insertSelective(CoinInfo record);

    int updateByPrimaryKey(CoinInfo record);

    int updateByPrimaryKeySelective(CoinInfo record);

    int deleteByPrimaryKey(Integer id);

    CoinInfo selectByPrimaryKey(Integer id);

    List<CoinInfo> selectAll(Map<Object, Object> param);

    List<CoinInfo> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}