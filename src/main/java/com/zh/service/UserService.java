package com.zh.service;

import com.zh.entity.User;
import java.util.List;
import java.util.Map;

/**
 * 业务逻辑接口:用户表 user
 * 
 * @author: autogeneration
 * @date: 2019-01-04 21:02:54
 **/ 
public interface UserService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:54
     **/ 
    int insert(User record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:54
     **/ 
    int insertSelective(User record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:54
     **/ 
    int updateByPrimaryKey(User record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:54
     **/ 
    int updateByPrimaryKeySelective(User record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:54
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:54
     **/ 
    User selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:54
     **/ 
    List<User> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:54
     **/ 
    List<User> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:54
     **/ 
    int selectCount(Map<Object, Object> param);
}