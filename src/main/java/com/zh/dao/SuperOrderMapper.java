package com.zh.dao;

import com.zh.entity.SuperOrder;
import java.util.List;
import java.util.Map;

public interface SuperOrderMapper {
    int insert(SuperOrder record);

    int insertSelective(SuperOrder record);

    int updateByPrimaryKey(SuperOrder record);

    int updateByPrimaryKeySelective(SuperOrder record);

    int deleteByPrimaryKey(Integer id);

    SuperOrder selectByPrimaryKey(Integer id);

    List<SuperOrder> selectAll(Map<Object, Object> param);

    List<SuperOrder> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}