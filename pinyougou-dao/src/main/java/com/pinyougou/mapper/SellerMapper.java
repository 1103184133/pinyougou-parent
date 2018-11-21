package com.pinyougou.mapper;

import com.pinyougou.pojo.Seller;
import com.pinyougou.pojo.SellerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SellerMapper {
    long countByExample(SellerExample example);

    int deleteByExample(SellerExample example);

    int insert(Seller record);

    int insertSelective(Seller record);

    List<Seller> selectByExample(SellerExample example);

    int updateByExampleSelective(@Param("record") Seller record, @Param("example") SellerExample example);

    int updateByExample(@Param("record") Seller record, @Param("example") SellerExample example);
}