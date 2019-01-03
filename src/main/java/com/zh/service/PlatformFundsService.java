package com.zh.service;

import com.zh.entity.PlatformFunds;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-03 14:12:07
 **/ 
public interface PlatformFundsService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:12:07
     **/ 
    int insert(PlatformFunds record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:12:07
     **/ 
    int insertSelective(PlatformFunds record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:12:07
     **/ 
    int updateByPrimaryKey(PlatformFunds record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:12:07
     **/ 
    int updateByPrimaryKeySelective(PlatformFunds record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:12:07
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:12:07
     **/ 
    PlatformFunds selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:12:07
     **/ 
    List<PlatformFunds> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:12:07
     **/ 
    List<PlatformFunds> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:12:07
     **/ 
    int selectCount(Map<Object, Object> param);
}