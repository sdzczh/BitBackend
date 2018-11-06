package com.zh.service;

import com.zh.entity.LogUserlogin;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2018-11-05 16:20:23
 **/ 
public interface LogUserloginService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:23
     **/ 
    int insert(LogUserlogin record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:23
     **/ 
    int insertSelective(LogUserlogin record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:23
     **/ 
    int updateByPrimaryKey(LogUserlogin record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:23
     **/ 
    int updateByPrimaryKeySelective(LogUserlogin record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:23
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:23
     **/ 
    LogUserlogin selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:23
     **/ 
    List<LogUserlogin> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:23
     **/ 
    List<LogUserlogin> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:23
     **/ 
    int selectCount(Map<Object, Object> param);
}