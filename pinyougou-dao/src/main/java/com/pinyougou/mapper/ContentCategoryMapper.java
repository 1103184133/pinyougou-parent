package com.pinyougou.mapper;

import com.pinyougou.pojo.ContentCategory;
import com.pinyougou.pojo.ContentCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContentCategoryMapper {
    long countByExample(ContentCategoryExample example);

    int deleteByExample(ContentCategoryExample example);

    int insert(ContentCategory record);

    int insertSelective(ContentCategory record);

    List<ContentCategory> selectByExample(ContentCategoryExample example);

    int updateByExampleSelective(@Param("record") ContentCategory record, @Param("example") ContentCategoryExample example);

    int updateByExample(@Param("record") ContentCategory record, @Param("example") ContentCategoryExample example);
}