package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TUsertrack;
import com.housedemo.houseapi.entity.TUsertrackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUsertrackMapper {
    int countByExample(TUsertrackExample example);

    int deleteByExample(TUsertrackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUsertrack record);

    int insertSelective(TUsertrack record);

    List<TUsertrack> selectByExample(TUsertrackExample example);

    TUsertrack selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUsertrack record, @Param("example") TUsertrackExample example);

    int updateByExample(@Param("record") TUsertrack record, @Param("example") TUsertrackExample example);

    int updateByPrimaryKeySelective(TUsertrack record);

    int updateByPrimaryKey(TUsertrack record);
}