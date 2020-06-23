package com.housedemo.houseapi.dao;

import com.housedemo.houseapi.entity.TArticle;
import com.housedemo.houseapi.entity.TArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TArticleMapper {
    int countByExample(TArticleExample example);

    int deleteByExample(TArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TArticle record);

    int insertSelective(TArticle record);

    List<TArticle> selectByExample(TArticleExample example);

    TArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TArticle record, @Param("example") TArticleExample example);

    int updateByExample(@Param("record") TArticle record, @Param("example") TArticleExample example);

    int updateByPrimaryKeySelective(TArticle record);

    int updateByPrimaryKey(TArticle record);
}