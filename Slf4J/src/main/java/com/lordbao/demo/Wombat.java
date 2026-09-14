package com.lordbao.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 本节阐述 {} 的参数化使用
 * 相比 + 的字符串拼接, {}的性能更高
 */
public class Wombat {

    private final Logger logger = LoggerFactory.getLogger(Wombat.class);
    private Integer t;
    private Integer oldT;

    public void setTemperature(Integer temperature) {

        oldT = t;
        t = temperature;
        if(oldT==null){
            logger.info("Temperature first set to {}.", t);
        }else {
            logger.info("Temperature set to {}. Old value was {}.", t, oldT);
        }


        if(temperature > 50) {
            logger.info("Temperature has risen above 50 degrees.");
        }
    }


    public static void main(String[] args) {
        Wombat wombat = new Wombat();
        wombat.setTemperature(25);
        wombat.setTemperature(51);
    }
}
