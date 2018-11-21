package com.pinyougou.mapper;

import com.pinyougou.pojo.Areas;
import com.pinyougou.pojo.AreasExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreasMapper {
    long countByExample(AreasExample example);

    int deleteByExample(AreasExample example);

    int insert(Areas record);

    int insertSelective(Areas record);

    List<Areas> selectByExample(AreasExample example);

    int updateByExampleSelective(@Param("record") Areas record, @Param("example") AreasExample example);

    int updateByExample(@Param("record") Areas record, @Param("example") AreasExample example);
}