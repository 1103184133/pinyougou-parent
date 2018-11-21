package com.pinyougou.mapper;

import com.pinyougou.pojo.GoodsDesc;
import com.pinyougou.pojo.GoodsDescExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDescMapper {
    long countByExample(GoodsDescExample example);

    int deleteByExample(GoodsDescExample example);

    int insert(GoodsDesc record);

    int insertSelective(GoodsDesc record);

    List<GoodsDesc> selectByExample(GoodsDescExample example);

    int updateByExampleSelective(@Param("record") GoodsDesc record, @Param("example") GoodsDescExample example);

    int updateByExample(@Param("record") GoodsDesc record, @Param("example") GoodsDescExample example);
}