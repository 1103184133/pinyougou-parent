package com.pinyougou.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.pinyougou.mapper")
public class MyBatisConfig {
}
