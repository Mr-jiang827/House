package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TTelstyle;
import com.housedemo.houseapi.entity.TTelstyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTelstyleMapper {
    int countByExample(TTelstyleExample example);

    int deleteByExample(TTelstyleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTelstyle record);

    int insertSelective(TTelstyle record);

    List<TTelstyle> selectByExample(TTelstyleExample example);

    TTelstyle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTelstyle record, @Param("example") TTelstyleExample example);

    int updateByExample(@Param("record") TTelstyle record, @Param("example") TTelstyleExample example);

    int updateByPrimaryKeySelective(TTelstyle record);

    int updateByPrimaryKey(TTelstyle record);
}