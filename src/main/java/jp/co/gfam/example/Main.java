package jp.co.gfam.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class Main {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}