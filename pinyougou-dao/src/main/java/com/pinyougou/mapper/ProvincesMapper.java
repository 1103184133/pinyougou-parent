package com.pinyougou.mapper;

import com.pinyougou.pojo.Provinces;
import com.pinyougou.pojo.ProvincesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProvincesMapper {
    long countByExample(ProvincesExample example);

    int deleteByExample(ProvincesExample example);

    int insert(Provinces record);

    int insertSelective(Provinces record);

    List<Provinces> selectByExample(ProvincesExample example);

    int updateByExampleSelective(@Param("record") Provinces record, @Param("example") ProvincesExample example);

    int updateByExample(@Param("record") Provinces record, @Param("example") ProvincesExample example);
}