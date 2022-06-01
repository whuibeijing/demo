package com.example.demo;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/log")
@Slf4j
public class TestLogController {


    @Autowired
    private UserService userService ;
    @GetMapping("/testLog")
    public String testSelfLog(@RequestParam String param1, @RequestParam String param2) {
        log.info("Processing trade with param1:[{}] and param2: [{}] ", param1, param2);
        userService.test();
        return "success";
    }
}

