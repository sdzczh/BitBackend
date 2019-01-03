package com.zh.dao;

import com.zh.entity.DayState;
import java.util.List;
import java.util.Map;

public interface DayStateMapper {
    int insert(DayState record);

    int insertSelective(DayState record);

    int updateByPrimaryKey(DayState record);

    int updateByPrimaryKeySelective(DayState record);

    int deleteByPrimaryKey(Integer id);

    DayState selectByPrimaryKey(Integer id);

    List<DayState> selectAll(Map<Object, Object> param);

    List<DayState> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}