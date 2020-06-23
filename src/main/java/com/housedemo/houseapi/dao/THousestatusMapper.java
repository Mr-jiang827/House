package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.THousestatus;
import com.housedemo.houseapi.entity.THousestatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THousestatusMapper {
    int countByExample(THousestatusExample example);

    int deleteByExample(THousestatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THousestatus record);

    int insertSelective(THousestatus record);

    List<THousestatus> selectByExample(THousestatusExample example);

    THousestatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THousestatus record, @Param("example") THousestatusExample example);

    int updateByExample(@Param("record") THousestatus record, @Param("example") THousestatusExample example);

    int updateByPrimaryKeySelective(THousestatus record);

    int updateByPrimaryKey(THousestatus record);
}