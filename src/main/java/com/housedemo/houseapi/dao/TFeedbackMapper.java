package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TFeedback;
import com.housedemo.houseapi.entity.TFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFeedbackMapper {
    int countByExample(TFeedbackExample example);

    int deleteByExample(TFeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TFeedback record);

    int insertSelective(TFeedback record);

    List<TFeedback> selectByExample(TFeedbackExample example);

    TFeedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TFeedback record, @Param("example") TFeedbackExample example);

    int updateByExample(@Param("record") TFeedback record, @Param("example") TFeedbackExample example);

    int updateByPrimaryKeySelective(TFeedback record);

    int updateByPrimaryKey(TFeedback record);
}