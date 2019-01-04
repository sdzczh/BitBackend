package com.zh.service;

import com.zh.entity.SmsRecord;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-04 21:02:12
 **/ 
public interface SmsRecordService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:12
     **/ 
    int insert(SmsRecord record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:12
     **/ 
    int insertSelective(SmsRecord record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:12
     **/ 
    int updateByPrimaryKey(SmsRecord record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:12
     **/ 
    int updateByPrimaryKeySelective(SmsRecord record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:12
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:12
     **/ 
    SmsRecord selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:12
     **/ 
    List<SmsRecord> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:12
     **/ 
    List<SmsRecord> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 21:02:12
     **/ 
    int selectCount(Map<Object, Object> param);
}