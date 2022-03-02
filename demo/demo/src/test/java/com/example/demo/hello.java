package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //表示這個入口類也是控制類，[email protected][email protected]
@SpringBootApplication
public class hello {

    @RequestMapping("/")   //請求的對映路由
    public String home(){
        return "hello world!!!!!";
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}