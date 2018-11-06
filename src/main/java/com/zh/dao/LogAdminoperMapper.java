package com.zh.dao;

import com.zh.entity.LogAdminoper;
import java.util.List;
import java.util.Map;

public interface LogAdminoperMapper {
    int insert(LogAdminoper record);

    int insertSelective(LogAdminoper record);

    int updateByPrimaryKey(LogAdminoper record);

    int updateByPrimaryKeySelective(LogAdminoper record);

    int deleteByPrimaryKey(Integer id);

    LogAdminoper selectByPrimaryKey(Integer id);

    List<LogAdminoper> selectAll(Map<Object, Object> param);

    List<LogAdminoper> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}