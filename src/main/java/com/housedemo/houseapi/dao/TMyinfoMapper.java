package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TMyinfo;
import com.housedemo.houseapi.entity.TMyinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMyinfoMapper {
    int countByExample(TMyinfoExample example);

    int deleteByExample(TMyinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMyinfo record);

    int insertSelective(TMyinfo record);

    List<TMyinfo> selectByExample(TMyinfoExample example);

    TMyinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMyinfo record, @Param("example") TMyinfoExample example);

    int updateByExample(@Param("record") TMyinfo record, @Param("example") TMyinfoExample example);

    int updateByPrimaryKeySelective(TMyinfo record);

    int updateByPrimaryKey(TMyinfo record);
}