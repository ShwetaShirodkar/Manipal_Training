package com.sss.spring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sss.spring.config.AppConfig;
import com.sss.spring.util.FileChecker;
import com.sss.spring.util.FileUtil;

public final class App {

    public static void normal() {
        FileUtil util = new FileUtil();

        FileChecker checker = new FileChecker(util);
        checker.checkFileValidity();
    }

    public static void withSpring() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        FileChecker checker = ctx.getBean(FileChecker.class);
        checker.checkFileValidity();
    }

    public static void main(String[] args) {
        withSpring();
    }
}