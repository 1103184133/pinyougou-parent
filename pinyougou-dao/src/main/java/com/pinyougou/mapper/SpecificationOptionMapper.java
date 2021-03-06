package com.pinyougou.mapper;

import com.pinyougou.pojo.SpecificationOption;
import com.pinyougou.pojo.SpecificationOptionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecificationOptionMapper {
    long countByExample(SpecificationOptionExample example);

    int deleteByExample(SpecificationOptionExample example);

    int insert(SpecificationOption record);

    int insertSelective(SpecificationOption record);

    List<SpecificationOption> selectByExample(SpecificationOptionExample example);

    int updateByExampleSelective(@Param("record") SpecificationOption record, @Param("example") SpecificationOptionExample example);

    int updateByExample(@Param("record") SpecificationOption record, @Param("example") SpecificationOptionExample example);
}