package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스포츠센터
//역할(role-인가) : user, manager, admin

@Log4j2
@Controller
public class IndexController {
    @GetMapping({"", "/"})
    public String index(){
        log.info("index");
        //-> /WEB-INF/views/{{index}}.jsp
        //어노테이션이 RestController에서 Controller로 변경됨
        //@RestController = @Controller + @ResponseBody -> 문자열 포맷
        //@Controller => 문자열이 출력으로 나갈 화면 이름이다.
        return "index";// -> ViewResolver
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
