package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TGarde;
import com.housedemo.houseapi.entity.TGardeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGardeMapper {
    int countByExample(TGardeExample example);

    int deleteByExample(TGardeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGarde record);

    int insertSelective(TGarde record);

    List<TGarde> selectByExample(TGardeExample example);

    TGarde selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TGarde record, @Param("example") TGardeExample example);

    int updateByExample(@Param("record") TGarde record, @Param("example") TGardeExample example);

    int updateByPrimaryKeySelective(TGarde record);

    int updateByPrimaryKey(TGarde record);
}