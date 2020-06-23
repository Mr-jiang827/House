package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TPremises;
import com.housedemo.houseapi.entity.TPremisesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPremisesMapper {
    int countByExample(TPremisesExample example);

    int deleteByExample(TPremisesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPremises record);

    int insertSelective(TPremises record);

    List<TPremises> selectByExample(TPremisesExample example);

    TPremises selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPremises record, @Param("example") TPremisesExample example);

    int updateByExample(@Param("record") TPremises record, @Param("example") TPremisesExample example);

    int updateByPrimaryKeySelective(TPremises record);

    int updateByPrimaryKey(TPremises record);
}