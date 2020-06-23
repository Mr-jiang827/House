package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TPurchase;
import com.housedemo.houseapi.entity.TPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPurchaseMapper {
    int countByExample(TPurchaseExample example);

    int deleteByExample(TPurchaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPurchase record);

    int insertSelective(TPurchase record);

    List<TPurchase> selectByExample(TPurchaseExample example);

    TPurchase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPurchase record, @Param("example") TPurchaseExample example);

    int updateByExample(@Param("record") TPurchase record, @Param("example") TPurchaseExample example);

    int updateByPrimaryKeySelective(TPurchase record);

    int updateByPrimaryKey(TPurchase record);
}