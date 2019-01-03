package com.zh.dao;

import com.zh.entity.PlatformFunds;
import java.util.List;
import java.util.Map;

public interface PlatformFundsMapper {
    int insert(PlatformFunds record);

    int insertSelective(PlatformFunds record);

    int updateByPrimaryKey(PlatformFunds record);

    int updateByPrimaryKeySelective(PlatformFunds record);

    int deleteByPrimaryKey(Integer id);

    PlatformFunds selectByPrimaryKey(Integer id);

    List<PlatformFunds> selectAll(Map<Object, Object> param);

    List<PlatformFunds> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}