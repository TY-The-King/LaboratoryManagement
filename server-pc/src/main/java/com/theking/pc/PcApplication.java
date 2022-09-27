package com.theking.pc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * @author TheKing
 * @version 1.0
 * @className PcApplication
 * @description
 * @date 2022/8/23 9:46
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.theking.pc","com.theking.common"})
@EnableWebSecurity
public class PcApplication {
    public static void main(String[] args) {
        SpringApplication.run(PcApplication.class,args);
    }
}
