package com.zh.service;

import com.zh.entity.PlatformFunds;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-04 21:01:51
 **/ 
public interface PlatformFundsService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:01:51
     **/ 
    int insert(PlatformFunds record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:01:51
     **/ 
    int insertSelective(PlatformFunds record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:01:51
     **/ 
    int updateByPrimaryKey(PlatformFunds record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:01:51
     **/ 
    int updateByPrimaryKeySelective(PlatformFunds record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:01:51
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:01:51
     **/ 
    PlatformFunds selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:01:51
     **/ 
    List<PlatformFunds> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:01:51
     **/ 
    List<PlatformFunds> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:01:51
     **/ 
    int selectCount(Map<Object, Object> param);
}