package com.example.xiesj.data.more;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.example.xiesj.data.more.mapper.db1",
        "com.example.xiesj.data.more.mapper.db2"})
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
public class MoreApplication {

    public static void main(String[] args) {
        
        SpringApplication.run(MoreApplication.class, args);
    }

}
