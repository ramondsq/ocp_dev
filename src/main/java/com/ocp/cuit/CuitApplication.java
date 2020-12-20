package com.ocp.cuit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.ocp.cuit.dao")
public class CuitApplication {

    public static void main(String[] args) {
        SpringApplication.run(CuitApplication.class, args);
    }

}
