package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.THouseview;
import com.housedemo.houseapi.entity.THouseviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THouseviewMapper {
    int countByExample(THouseviewExample example);

    int deleteByExample(THouseviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THouseview record);

    int insertSelective(THouseview record);

    List<THouseview> selectByExample(THouseviewExample example);

    THouseview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THouseview record, @Param("example") THouseviewExample example);

    int updateByExample(@Param("record") THouseview record, @Param("example") THouseviewExample example);

    int updateByPrimaryKeySelective(THouseview record);

    int updateByPrimaryKey(THouseview record);
}