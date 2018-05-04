package com.example.demo.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author cdy
 * @version V1.0
 * @Description: 描述
 * @date 2018/5/4 11:25
 */
@Component
public class StartUpRunner implements CommandLineRunner {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run(String... strings) throws Exception {
        LOGGER.info("StartUPRunner ....");
    }
}
