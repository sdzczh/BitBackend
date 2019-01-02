package com.zh.dao;

import com.zh.entity.CapDistribution;
import java.util.List;
import java.util.Map;

public interface CapDistributionMapper {
    int insert(CapDistribution record);

    int insertSelective(CapDistribution record);

    int updateByPrimaryKey(CapDistribution record);

    int updateByPrimaryKeySelective(CapDistribution record);

    int deleteByPrimaryKey(Integer id);

    CapDistribution selectByPrimaryKey(Integer id);

    List<CapDistribution> selectAll(Map<Object, Object> param);

    List<CapDistribution> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}