package com.zh.service;

import com.zh.entity.LogAdminlogin;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2018-11-05 16:20:02
 **/ 
public interface LogAdminloginService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:02
     **/ 
    int insert(LogAdminlogin record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:02
     **/ 
    int insertSelective(LogAdminlogin record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:02
     **/ 
    int updateByPrimaryKey(LogAdminlogin record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:02
     **/ 
    int updateByPrimaryKeySelective(LogAdminlogin record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:02
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:02
     **/ 
    LogAdminlogin selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:02
     **/ 
    List<LogAdminlogin> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:02
     **/ 
    List<LogAdminlogin> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2018-11-05 16:20:02
     **/ 
    int selectCount(Map<Object, Object> param);
}