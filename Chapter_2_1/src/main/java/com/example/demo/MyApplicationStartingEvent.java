package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author cdy
 * @version V1.0
 * @Description: 描述
 * @date 2018/5/4 12:02
 */
public class MyApplicationStartingEvent implements ApplicationListener<ApplicationStartingEvent> {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        LOGGER.info("ApplicationStartingEvent...");
    }
}
