package com.pinyougou.mapper;

import com.pinyougou.pojo.SeckillOrder;
import com.pinyougou.pojo.SeckillOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SeckillOrderMapper {
    long countByExample(SeckillOrderExample example);

    int deleteByExample(SeckillOrderExample example);

    int insert(SeckillOrder record);

    int insertSelective(SeckillOrder record);

    List<SeckillOrder> selectByExample(SeckillOrderExample example);

    int updateByExampleSelective(@Param("record") SeckillOrder record, @Param("example") SeckillOrderExample example);

    int updateByExample(@Param("record") SeckillOrder record, @Param("example") SeckillOrderExample example);
}