 package com.example.demo;

 import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

 /**
 * @author cdy
 * @version V1.0
 * @Description: 描述
 * @date 2018/5/4 12:02
 */
public class MyApplicationEnvironmentPreparedEvent implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent) {
        LOGGER.info("ApplicationEnvironmentPreparedEvent...");
    }

}
