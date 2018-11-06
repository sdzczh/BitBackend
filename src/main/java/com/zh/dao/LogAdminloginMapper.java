package com.zh.dao;

import com.zh.entity.LogAdminlogin;
import java.util.List;
import java.util.Map;

public interface LogAdminloginMapper {
    int insert(LogAdminlogin record);

    int insertSelective(LogAdminlogin record);

    int updateByPrimaryKey(LogAdminlogin record);

    int updateByPrimaryKeySelective(LogAdminlogin record);

    int deleteByPrimaryKey(Integer id);

    LogAdminlogin selectByPrimaryKey(Integer id);

    List<LogAdminlogin> selectAll(Map<Object, Object> param);

    List<LogAdminlogin> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}