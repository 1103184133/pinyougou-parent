package com.pinyougou.mapper;

import com.pinyougou.pojo.Goods;
import com.pinyougou.pojo.GoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    long countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);
}