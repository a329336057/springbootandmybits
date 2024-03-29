package com.wzy.testboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启事务管理
@MapperScan("com.wzy.testboot.dao")//与dao层的@Mapper二选一写上即可(主要作用是扫包)
public class TestbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestbootApplication.class, args);
    }

}
