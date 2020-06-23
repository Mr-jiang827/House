package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TGuide;
import com.housedemo.houseapi.entity.TGuideExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGuideMapper {
    int countByExample(TGuideExample example);

    int deleteByExample(TGuideExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGuide record);

    int insertSelective(TGuide record);

    List<TGuide> selectByExample(TGuideExample example);

    TGuide selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TGuide record, @Param("example") TGuideExample example);

    int updateByExample(@Param("record") TGuide record, @Param("example") TGuideExample example);

    int updateByPrimaryKeySelective(TGuide record);

    int updateByPrimaryKey(TGuide record);
}