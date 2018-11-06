package com.zh.service;

import com.zh.entity.LogAdminoper;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2018-11-06 10:25:44
 **/ 
public interface LogAdminoperService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-11-06 10:25:44
     **/ 
    int insert(LogAdminoper record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-11-06 10:25:44
     **/ 
    int insertSelective(LogAdminoper record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-11-06 10:25:44
     **/ 
    int updateByPrimaryKey(LogAdminoper record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-11-06 10:25:44
     **/ 
    int updateByPrimaryKeySelective(LogAdminoper record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2018-11-06 10:25:44
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2018-11-06 10:25:44
     **/ 
    LogAdminoper selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2018-11-06 10:25:44
     **/ 
    List<LogAdminoper> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2018-11-06 10:25:44
     **/ 
    List<LogAdminoper> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2018-11-06 10:25:44
     **/ 
    int selectCount(Map<Object, Object> param);

    void insertLog(String account, Integer operId, String oper);
}