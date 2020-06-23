package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TCounselor;
import com.housedemo.houseapi.entity.TCounselorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCounselorMapper {
    int countByExample(TCounselorExample example);

    int deleteByExample(TCounselorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCounselor record);

    int insertSelective(TCounselor record);

    List<TCounselor> selectByExample(TCounselorExample example);

    TCounselor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCounselor record, @Param("example") TCounselorExample example);

    int updateByExample(@Param("record") TCounselor record, @Param("example") TCounselorExample example);

    int updateByPrimaryKeySelective(TCounselor record);

    int updateByPrimaryKey(TCounselor record);
}