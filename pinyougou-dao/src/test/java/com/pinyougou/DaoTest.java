package com.pinyougou;

import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.Brand;
import com.pinyougou.pojo.BrandExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ApplicationDao.class})
public class DaoTest {

    @Autowired
    private BrandMapper mapper;

    @Test
    public void  testDao() {
        List<Brand> brands = mapper.selectByExample(new BrandExample());
        System.out.println(brands);
    }

}
