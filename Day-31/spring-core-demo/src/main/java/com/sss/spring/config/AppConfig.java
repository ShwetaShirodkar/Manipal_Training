package com.sss.spring.config;

import java.io.File;

import org.springframework.context.annotation.Bean;

import com.sss.spring.util.FileChecker;
import com.sss.spring.util.FileUtil;

public class AppConfig {
   
    @Bean
    public FileUtil util() {
        return new FileUtil();
    }

    @Bean
    public FileChecker checker(FileUtil util) {
        return new FileChecker(util);
    }
}