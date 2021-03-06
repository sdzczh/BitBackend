package com.zh.service;

import com.zh.entity.CapDistribution;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-04 20:05:25
 **/ 
public interface CapDistributionService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:05:25
     **/ 
    int insert(CapDistribution record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:05:25
     **/ 
    int insertSelective(CapDistribution record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:05:25
     **/ 
    int updateByPrimaryKey(CapDistribution record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:05:25
     **/ 
    int updateByPrimaryKeySelective(CapDistribution record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:05:25
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:05:25
     **/ 
    CapDistribution selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:05:25
     **/ 
    List<CapDistribution> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:05:25
     **/ 
    List<CapDistribution> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:05:25
     **/ 
    int selectCount(Map<Object, Object> param);
}