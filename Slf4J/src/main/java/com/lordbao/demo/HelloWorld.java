package com.lordbao.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Lord_Bao
 * @Date 2026/9/11 16:28
 * @Version 1.0
 */
public class HelloWorld {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.info("hello world");
    }
}
