package com.theking.pc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author TheKing
 * @version 1.0
 * @className PcApplication
 * @description
 * @date 2022/8/23 9:46
 */
@SpringBootApplication
public class PcApplication {
    public static void main(String[] args) {
        SpringApplication.run(PcApplication.class,args);
    }
}
