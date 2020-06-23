package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TCarourad;
import com.housedemo.houseapi.entity.TCarouradExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCarouradMapper {
    int countByExample(TCarouradExample example);

    int deleteByExample(TCarouradExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCarourad record);

    int insertSelective(TCarourad record);

    List<TCarourad> selectByExample(TCarouradExample example);

    TCarourad selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCarourad record, @Param("example") TCarouradExample example);

    int updateByExample(@Param("record") TCarourad record, @Param("example") TCarouradExample example);

    int updateByPrimaryKeySelective(TCarourad record);

    int updateByPrimaryKey(TCarourad record);
}