package com.zh.service;

import com.zh.entity.SuperOrder;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-04 21:02:33
 **/ 
public interface SuperOrderService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:33
     **/ 
    int insert(SuperOrder record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:33
     **/ 
    int insertSelective(SuperOrder record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:33
     **/ 
    int updateByPrimaryKey(SuperOrder record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:33
     **/ 
    int updateByPrimaryKeySelective(SuperOrder record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:33
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:33
     **/ 
    SuperOrder selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:33
     **/ 
    List<SuperOrder> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:33
     **/ 
    List<SuperOrder> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:33
     **/ 
    int selectCount(Map<Object, Object> param);
}