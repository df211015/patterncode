package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("设计模式示例代码多项目启动成功!");

//        String source = "http://img5.taoche.cn/00/de6a63bd-102301vzar.jpg";
//        String replace = source.replace("/00/", "/39/");
//        String str = "";
    }
}
