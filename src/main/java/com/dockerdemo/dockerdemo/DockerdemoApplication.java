package com.dockerdemo.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerdemoApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to my docker page";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerdemoApplication.class, args);
    }
//"# Docker-ci-cd" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/UzoAfrica/Docker-ci-cd.git
//    git push -u origin main
}
