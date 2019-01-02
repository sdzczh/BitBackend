package com.zh.service;

import com.zh.entity.CoinPrice;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-02 16:52:40
 **/ 
public interface CoinPriceService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:52:40
     **/ 
    int insert(CoinPrice record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:52:40
     **/ 
    int insertSelective(CoinPrice record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:52:40
     **/ 
    int updateByPrimaryKey(CoinPrice record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:52:40
     **/ 
    int updateByPrimaryKeySelective(CoinPrice record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:52:40
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:52:40
     **/ 
    CoinPrice selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:52:40
     **/ 
    List<CoinPrice> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:52:40
     **/ 
    List<CoinPrice> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-01-02 16:52:40
     **/ 
    int selectCount(Map<Object, Object> param);
}