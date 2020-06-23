package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TLimits;
import com.housedemo.houseapi.entity.TLimitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLimitsMapper {
    int countByExample(TLimitsExample example);

    int deleteByExample(TLimitsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLimits record);

    int insertSelective(TLimits record);

    List<TLimits> selectByExample(TLimitsExample example);

    TLimits selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TLimits record, @Param("example") TLimitsExample example);

    int updateByExample(@Param("record") TLimits record, @Param("example") TLimitsExample example);

    int updateByPrimaryKeySelective(TLimits record);

    int updateByPrimaryKey(TLimits record);
}