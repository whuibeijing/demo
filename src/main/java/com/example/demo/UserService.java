package com.example.demo ;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

     public String test() {
         
        log.info("test", "aaa");
        return "";

     }
    
}
