package com.reachingskies.spring.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class SpringJenkinsApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

    @PostConstruct
    public void init() {
        logger.info("Application started");
    }

    @GetMapping("/")
    public String greeting() {
        return "Welcome Jenkins";
    }

    public static void main(String[] args) {
        logger.info("Application executed");
        SpringApplication.run(SpringJenkinsApplication.class, args);
    }

}
