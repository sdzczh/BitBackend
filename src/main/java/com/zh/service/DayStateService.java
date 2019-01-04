package com.zh.service;

import com.zh.entity.DayState;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-04 20:33:24
 **/ 
public interface DayStateService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:33:24
     **/ 
    int insert(DayState record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:33:24
     **/ 
    int insertSelective(DayState record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:33:24
     **/ 
    int updateByPrimaryKey(DayState record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:33:24
     **/ 
    int updateByPrimaryKeySelective(DayState record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:33:24
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:33:24
     **/ 
    DayState selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:33:24
     **/ 
    List<DayState> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:33:24
     **/ 
    List<DayState> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:33:24
     **/ 
    int selectCount(Map<Object, Object> param);
}