package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TService;
import com.housedemo.houseapi.entity.TServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TServiceMapper {
    int countByExample(TServiceExample example);

    int deleteByExample(TServiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TService record);

    int insertSelective(TService record);

    List<TService> selectByExample(TServiceExample example);

    TService selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TService record, @Param("example") TServiceExample example);

    int updateByExample(@Param("record") TService record, @Param("example") TServiceExample example);

    int updateByPrimaryKeySelective(TService record);

    int updateByPrimaryKey(TService record);
}