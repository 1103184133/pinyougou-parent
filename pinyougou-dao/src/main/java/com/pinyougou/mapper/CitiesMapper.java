package com.pinyougou.mapper;

import com.pinyougou.pojo.Cities;
import com.pinyougou.pojo.CitiesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CitiesMapper {
    long countByExample(CitiesExample example);

    int deleteByExample(CitiesExample example);

    int insert(Cities record);

    int insertSelective(Cities record);

    List<Cities> selectByExample(CitiesExample example);

    int updateByExampleSelective(@Param("record") Cities record, @Param("example") CitiesExample example);

    int updateByExample(@Param("record") Cities record, @Param("example") CitiesExample example);
}