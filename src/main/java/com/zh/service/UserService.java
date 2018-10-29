package com.zh.service;

import com.zh.entity.User;
import java.util.List;
import java.util.Map;

/**
 * 业务逻辑接口:用户表 user
 * 
 * @author: autogeneration
 * @date: 2018-10-29 16:25:47
 **/ 
public interface UserService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:25:47
     **/ 
    int insert(User record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:25:47
     **/ 
    int insertSelective(User record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:25:47
     **/ 
    int updateByPrimaryKey(User record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:25:47
     **/ 
    int updateByPrimaryKeySelective(User record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:25:47
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:25:47
     **/ 
    User selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:25:47
     **/ 
    List<User> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:25:47
     **/ 
    List<User> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2018-10-29 16:25:47
     **/ 
    int selectCount(Map<Object, Object> param);
}