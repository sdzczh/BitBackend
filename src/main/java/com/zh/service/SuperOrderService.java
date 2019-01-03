package com.zh.service;

import com.zh.entity.SuperOrder;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-03 14:54:05
 **/ 
public interface SuperOrderService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:54:05
     **/ 
    int insert(SuperOrder record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:54:05
     **/ 
    int insertSelective(SuperOrder record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:54:05
     **/ 
    int updateByPrimaryKey(SuperOrder record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:54:05
     **/ 
    int updateByPrimaryKeySelective(SuperOrder record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:54:05
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:54:05
     **/ 
    SuperOrder selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:54:05
     **/ 
    List<SuperOrder> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:54:05
     **/ 
    List<SuperOrder> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-01-03 14:54:05
     **/ 
    int selectCount(Map<Object, Object> param);
}