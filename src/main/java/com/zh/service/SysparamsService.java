package com.zh.service;

import com.zh.entity.Sysparams;
import java.util.List;
import java.util.Map;

/**
 * 业务逻辑接口:系统参数 sysparams
 * 
 * @author: autogeneration
 * @date: 2019-01-04 21:02:45
 **/ 
public interface SysparamsService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:45
     **/ 
    int insert(Sysparams record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:45
     **/ 
    int insertSelective(Sysparams record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:45
     **/ 
    int updateByPrimaryKey(Sysparams record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:45
     **/ 
    int updateByPrimaryKeySelective(Sysparams record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:45
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:45
     **/ 
    Sysparams selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:45
     **/ 
    List<Sysparams> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:45
     **/ 
    List<Sysparams> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:45
     **/ 
    int selectCount(Map<Object, Object> param);
}