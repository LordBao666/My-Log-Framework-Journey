package com.lordbao.loginspringboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LogInSpringBootApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(LogInSpringBootApplicationTests.class);
    @Test
    public void testLogLevel() {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

}
