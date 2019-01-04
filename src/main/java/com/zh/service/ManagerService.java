package com.zh.service;

import com.zh.entity.Manager;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-04 21:00:30
 **/ 
public interface ManagerService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:00:30
     **/ 
    int insert(Manager record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:00:30
     **/ 
    int insertSelective(Manager record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:00:30
     **/ 
    int updateByPrimaryKey(Manager record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:00:30
     **/ 
    int updateByPrimaryKeySelective(Manager record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:00:30
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:00:30
     **/ 
    Manager selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:00:30
     **/ 
    List<Manager> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:00:30
     **/ 
    List<Manager> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:00:30
     **/ 
    int selectCount(Map<Object, Object> param);

    Manager login(Manager manager);
}