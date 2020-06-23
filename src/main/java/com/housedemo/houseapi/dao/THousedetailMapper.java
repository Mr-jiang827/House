package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.THousedetail;
import com.housedemo.houseapi.entity.THousedetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THousedetailMapper {
    int countByExample(THousedetailExample example);

    int deleteByExample(THousedetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THousedetail record);

    int insertSelective(THousedetail record);

    List<THousedetail> selectByExample(THousedetailExample example);

    THousedetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THousedetail record, @Param("example") THousedetailExample example);

    int updateByExample(@Param("record") THousedetail record, @Param("example") THousedetailExample example);

    int updateByPrimaryKeySelective(THousedetail record);

    int updateByPrimaryKey(THousedetail record);
}