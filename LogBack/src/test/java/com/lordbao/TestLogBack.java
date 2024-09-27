package com.lordbao;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Lord_Bao
 * @Date 2024/9/21 11:33
 * @Version 1.0
 */


public class TestLogBack {

    private final Logger logger = LoggerFactory.getLogger(TestLogBack.class);

    /**
     * 当你设置级别之后，日志仅会记录你设置的级别及其以上级别的信息。
     * 比如当你设置为INFO级别时，会仅打印INFO，WARN，ERROR的级别信息。
     * 不同的日志框架实现的默认级别不尽相同，因此需要用户自己进行级别相关设置
     */
    @Test
    public void testLogLevel(){

        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

    @Test
    public void testPlaceHolder(){
        String name = "jack";
        Integer age = 18;
        String hometown = "CN";
        //占位符
        logger.info("My Name is {}, I'm {} years old, from {}",name,age,hometown);

        try{
            int a =1/0;
        }catch (Exception e){
            //此处是trace,debug,info,warning,error的重载方法
            logger.error("An error has arisen: ",e);
        }
    }

    @Test
    public void  testRollFileAppender(){
        for (int i = 0; i < 1000; i++) {
            logger.trace("trace"+i);
            logger.debug("debug"+i);
            logger.info("info"+i);
            logger.warn("warn"+i);
            logger.error("error"+i);
        }
    }

    @Test
    public void testAsyncAppender(){
        for (int i = 0; i < 4000; i++) {
            logger.trace("trace"+i);
            logger.debug("debug"+i);
            logger.info("info"+i);
            logger.warn("warn"+i);
            logger.error("error"+i);
        }
        //正常业务
        for (int i = 0; i < 1000; i++) {
            System.out.println("正常业务"+i);
        }
    }

}
