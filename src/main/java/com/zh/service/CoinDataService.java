package com.zh.service;

import com.zh.entity.CoinData;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-02 16:04:42
 **/ 
public interface CoinDataService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:04:42
     **/ 
    int insert(CoinData record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:04:42
     **/ 
    int insertSelective(CoinData record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:04:42
     **/ 
    int updateByPrimaryKey(CoinData record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:04:42
     **/ 
    int updateByPrimaryKeySelective(CoinData record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:04:42
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:04:42
     **/ 
    CoinData selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:04:42
     **/ 
    List<CoinData> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:04:42
     **/ 
    List<CoinData> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:04:42
     **/ 
    int selectCount(Map<Object, Object> param);
}