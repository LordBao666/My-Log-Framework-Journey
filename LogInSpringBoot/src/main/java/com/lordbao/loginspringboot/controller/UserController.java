package com.lordbao.loginspringboot.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Lord_Bao
 * @Date 2024/9/26 21:19
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
    @GetMapping("test")
    public String test(){
        log.info("test() !!!");
        return "hello";
    }
}
