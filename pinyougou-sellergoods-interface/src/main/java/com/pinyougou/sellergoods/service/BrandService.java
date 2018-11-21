package com.pinyougou.sellergoods.service;

import com.pinyougou.entity.PageResult;
import com.pinyougou.entity.Result;
import com.pinyougou.pojo.Brand;

import java.util.List;

/**
 * 品牌接口
 */
public interface BrandService {
    List<Brand> findAll();

    /**
     * 品牌分页
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageResult<Brand> findPage(int pageNum, int pageSize);


    /**
     * 增加
     * @param brand
     */
    void add(Brand brand);
}
