package com.zh.dao;

import com.zh.entity.CoinManager;
import java.util.List;
import java.util.Map;

public interface CoinManagerMapper {
    int insert(CoinManager record);

    int insertSelective(CoinManager record);

    int updateByPrimaryKey(CoinManager record);

    int updateByPrimaryKeySelective(CoinManager record);

    int deleteByPrimaryKey(Integer id);

    CoinManager selectByPrimaryKey(Integer id);

    List<CoinManager> selectAll(Map<Object, Object> param);

    List<CoinManager> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}