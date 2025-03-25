package edu.czjt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // 设置控制台编码
        System.setProperty("console.encoding", "UTF-8");
        System.setProperty("file.encoding", "UTF-8");
        SpringApplication.run(DemoApplication.class, args);
    }

}
