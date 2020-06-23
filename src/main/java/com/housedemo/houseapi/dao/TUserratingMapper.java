package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TUserrating;
import com.housedemo.houseapi.entity.TUserratingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserratingMapper {
    int countByExample(TUserratingExample example);

    int deleteByExample(TUserratingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserrating record);

    int insertSelective(TUserrating record);

    List<TUserrating> selectByExample(TUserratingExample example);

    TUserrating selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserrating record, @Param("example") TUserratingExample example);

    int updateByExample(@Param("record") TUserrating record, @Param("example") TUserratingExample example);

    int updateByPrimaryKeySelective(TUserrating record);

    int updateByPrimaryKey(TUserrating record);
}