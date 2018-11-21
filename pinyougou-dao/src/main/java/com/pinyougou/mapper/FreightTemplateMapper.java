package com.pinyougou.mapper;

import com.pinyougou.pojo.FreightTemplate;
import com.pinyougou.pojo.FreightTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FreightTemplateMapper {
    long countByExample(FreightTemplateExample example);

    int deleteByExample(FreightTemplateExample example);

    int insert(FreightTemplate record);

    int insertSelective(FreightTemplate record);

    List<FreightTemplate> selectByExample(FreightTemplateExample example);

    int updateByExampleSelective(@Param("record") FreightTemplate record, @Param("example") FreightTemplateExample example);

    int updateByExample(@Param("record") FreightTemplate record, @Param("example") FreightTemplateExample example);
}