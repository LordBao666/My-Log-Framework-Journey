package com.lordbao.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Lord_Bao
 * @Date 2026/9/14 12:58
 * @Version 1.0
 *
 *
 * 当你设置级别之后，日志仅会记录你设置的级别及其以上级别的信息。
 * 比如当你设置为INFO级别时，会仅打印INFO，WARN，ERROR的级别信息。
*  不同的日志框架实现的默认级别不尽相同，因此需要用户自己进行级别相关设置
 */
public class MyLoggerLevelTest {




    private static final Logger log = LoggerFactory.getLogger(MyLoggerLevelTest.class);
    public static void main(String[] args) {
        log.trace("hello.trace");
        log.debug("hello.debug");
        log.info("hello.info");
        log.warn("hello.warn");
        log.error("hello.error");
    }
}
