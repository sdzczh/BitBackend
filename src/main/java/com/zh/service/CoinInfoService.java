package com.zh.service;

import com.zh.entity.CoinInfo;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2018-11-01 09:49:07
 **/ 
public interface CoinInfoService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:49:07
     **/ 
    int insert(CoinInfo record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:49:07
     **/ 
    int insertSelective(CoinInfo record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:49:07
     **/ 
    int updateByPrimaryKey(CoinInfo record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:49:07
     **/ 
    int updateByPrimaryKeySelective(CoinInfo record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:49:07
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:49:07
     **/ 
    CoinInfo selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:49:07
     **/ 
    List<CoinInfo> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:49:07
     **/ 
    List<CoinInfo> selectPaging(Map<Object, Object> param);

    List<Map<String, Object>> selectInfoPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:49:07
     **/ 
    int selectCount(Map<Object, Object> param);
}