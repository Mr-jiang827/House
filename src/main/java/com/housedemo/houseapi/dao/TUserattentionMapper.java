package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TUserattention;
import com.housedemo.houseapi.entity.TUserattentionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserattentionMapper {
    int countByExample(TUserattentionExample example);

    int deleteByExample(TUserattentionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserattention record);

    int insertSelective(TUserattention record);

    List<TUserattention> selectByExample(TUserattentionExample example);

    TUserattention selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserattention record, @Param("example") TUserattentionExample example);

    int updateByExample(@Param("record") TUserattention record, @Param("example") TUserattentionExample example);

    int updateByPrimaryKeySelective(TUserattention record);

    int updateByPrimaryKey(TUserattention record);
}