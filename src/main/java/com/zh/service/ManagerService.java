package com.zh.service;

import com.zh.entity.Manager;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2018-10-29 16:01:58
 **/ 
public interface ManagerService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:01:58
     **/ 
    int insert(Manager record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:01:58
     **/ 
    int insertSelective(Manager record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:01:58
     **/ 
    int updateByPrimaryKey(Manager record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:01:58
     **/ 
    int updateByPrimaryKeySelective(Manager record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:01:58
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:01:58
     **/ 
    Manager selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:01:58
     **/ 
    List<Manager> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:01:58
     **/ 
    List<Manager> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:01:58
     **/ 
    int selectCount(Map<Object, Object> param);

    Manager login(Manager manager);
}