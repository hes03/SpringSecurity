package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스포츠센터
//역할(role-인가) : user, manager, admin

@Log4j2
//@Controller - 각 메서드가 view를 리턴한다.
@RestController
public class IndexController {
    @GetMapping({"", "/"})
    public String home(){
        log.info("home");
        return "home";
    }
    @GetMapping("/user")
    public String user(){
        log.info("user");
        return "user";
    }
    @GetMapping("/manager")
    public String manager(){
        log.info("manager");
        return "manager";
    }
    @GetMapping("/admin")
    public String admin(){
        log.info("admin");
        return "admin";
    }//end of home
}
