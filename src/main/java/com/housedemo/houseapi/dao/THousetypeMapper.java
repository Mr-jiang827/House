package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.THousetype;
import com.housedemo.houseapi.entity.THousetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THousetypeMapper {
    int countByExample(THousetypeExample example);

    int deleteByExample(THousetypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THousetype record);

    int insertSelective(THousetype record);

    List<THousetype> selectByExample(THousetypeExample example);

    THousetype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THousetype record, @Param("example") THousetypeExample example);

    int updateByExample(@Param("record") THousetype record, @Param("example") THousetypeExample example);

    int updateByPrimaryKeySelective(THousetype record);

    int updateByPrimaryKey(THousetype record);
}