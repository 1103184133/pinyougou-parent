package com.pinyougou.mapper;

import com.pinyougou.pojo.PayLog;
import com.pinyougou.pojo.PayLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PayLogMapper {
    long countByExample(PayLogExample example);

    int deleteByExample(PayLogExample example);

    int insert(PayLog record);

    int insertSelective(PayLog record);

    List<PayLog> selectByExample(PayLogExample example);

    int updateByExampleSelective(@Param("record") PayLog record, @Param("example") PayLogExample example);

    int updateByExample(@Param("record") PayLog record, @Param("example") PayLogExample example);
}