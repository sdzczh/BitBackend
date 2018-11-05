package com.zh.service;

import com.zh.entity.CoinInfo;
import com.zh.entity.CoinManager;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2018-11-01 09:48:51
 **/ 
public interface CoinManagerService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:48:51
     **/ 
    int insert(CoinManager record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:48:51
     **/ 
    int insertSelective(CoinManager record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:48:51
     **/ 
    int updateByPrimaryKey(CoinManager record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:48:51
     **/ 
    int updateByPrimaryKeySelective(CoinManager record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:48:51
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:48:51
     **/ 
    CoinManager selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:48:51
     **/ 
    List<CoinManager> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:48:51
     **/ 
    List<CoinManager> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2018-11-01 09:48:51
     **/ 
    int selectCount(Map<Object, Object> param);

    void insertManagerAndInfo(CoinManager coinManager, CoinInfo coinInfo);
}