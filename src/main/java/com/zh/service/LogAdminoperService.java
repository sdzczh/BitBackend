package com.zh.service;

import com.zh.entity.LogAdminoper;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2018-11-05 16:20:13
 **/ 
public interface LogAdminoperService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:13
     **/ 
    int insert(LogAdminoper record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:13
     **/ 
    int insertSelective(LogAdminoper record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:13
     **/ 
    int updateByPrimaryKey(LogAdminoper record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:13
     **/ 
    int updateByPrimaryKeySelective(LogAdminoper record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:13
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:13
     **/ 
    LogAdminoper selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:13
     **/ 
    List<LogAdminoper> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:13
     **/ 
    List<LogAdminoper> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:13
     **/ 
    int selectCount(Map<Object, Object> param);
}