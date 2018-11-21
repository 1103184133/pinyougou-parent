package com.pinyougou.mapper;

import com.pinyougou.pojo.ItemCat;
import com.pinyougou.pojo.ItemCatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemCatMapper {
    long countByExample(ItemCatExample example);

    int deleteByExample(ItemCatExample example);

    int insert(ItemCat record);

    int insertSelective(ItemCat record);

    List<ItemCat> selectByExample(ItemCatExample example);

    int updateByExampleSelective(@Param("record") ItemCat record, @Param("example") ItemCatExample example);

    int updateByExample(@Param("record") ItemCat record, @Param("example") ItemCatExample example);
}