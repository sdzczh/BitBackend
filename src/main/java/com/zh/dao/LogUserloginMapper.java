package com.zh.dao;

import com.zh.entity.LogUserlogin;
import java.util.List;
import java.util.Map;

public interface LogUserloginMapper {
    int insert(LogUserlogin record);

    int insertSelective(LogUserlogin record);

    int updateByPrimaryKey(LogUserlogin record);

    int updateByPrimaryKeySelective(LogUserlogin record);

    int deleteByPrimaryKey(Integer id);

    LogUserlogin selectByPrimaryKey(Integer id);

    List<LogUserlogin> selectAll(Map<Object, Object> param);

    List<LogUserlogin> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}