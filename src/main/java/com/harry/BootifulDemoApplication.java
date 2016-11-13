package com.harry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootifulDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootifulDemoApplication.class, args);
    }

    @ConditionalOnClass(String.class)
    @Bean
    public String string() {
        String s = "conditionals work...";
        System.out.println(s);
        return s;
    }
}
