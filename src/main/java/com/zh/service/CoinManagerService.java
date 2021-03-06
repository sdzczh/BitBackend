package com.zh.service;

import com.zh.entity.CoinInfo;
import com.zh.entity.CoinManager;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-04 20:28:23
 **/ 
public interface CoinManagerService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:28:23
     **/ 
    int insert(CoinManager record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:28:23
     **/ 
    int insertSelective(CoinManager record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:28:23
     **/ 
    int updateByPrimaryKey(CoinManager record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:28:23
     **/ 
    int updateByPrimaryKeySelective(CoinManager record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:28:23
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:28:23
     **/ 
    CoinManager selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:28:23
     **/ 
    List<CoinManager> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:28:23
     **/ 
    List<CoinManager> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:28:23
     **/ 
    int selectCount(Map<Object, Object> param);

    void insertManagerAndInfo(CoinManager coinManager, CoinInfo coinInfo);
}