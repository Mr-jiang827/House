package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TMuhouse;
import com.housedemo.houseapi.entity.TMuhouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMuhouseMapper {
    int countByExample(TMuhouseExample example);

    int deleteByExample(TMuhouseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMuhouse record);

    int insertSelective(TMuhouse record);

    List<TMuhouse> selectByExample(TMuhouseExample example);

    TMuhouse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMuhouse record, @Param("example") TMuhouseExample example);

    int updateByExample(@Param("record") TMuhouse record, @Param("example") TMuhouseExample example);

    int updateByPrimaryKeySelective(TMuhouse record);

    int updateByPrimaryKey(TMuhouse record);
}