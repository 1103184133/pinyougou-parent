package com.pinyougou.mapper;

import com.pinyougou.pojo.TypeTemplate;
import com.pinyougou.pojo.TypeTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypeTemplateMapper {
    long countByExample(TypeTemplateExample example);

    int deleteByExample(TypeTemplateExample example);

    int insert(TypeTemplate record);

    int insertSelective(TypeTemplate record);

    List<TypeTemplate> selectByExample(TypeTemplateExample example);

    int updateByExampleSelective(@Param("record") TypeTemplate record, @Param("example") TypeTemplateExample example);

    int updateByExample(@Param("record") TypeTemplate record, @Param("example") TypeTemplateExample example);
}