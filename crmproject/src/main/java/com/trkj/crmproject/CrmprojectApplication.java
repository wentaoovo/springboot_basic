package com.trkj.crmproject;

import com.trkj.crmproject.util.IdWorker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//配置MyBatis注解的扫描
@MapperScan("com.trkj.crmproject.dao")
public class CrmprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmprojectApplication.class, args);
    }
    @Bean
    public IdWorker idWorker(){return new IdWorker();}

}
