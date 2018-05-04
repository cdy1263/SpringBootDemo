 package com.example.demo;


 import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
 import org.springframework.stereotype.Component;

 /**
  * @author cdy
  * @version V1.0
  * @Description: 描述
  * @date 2018/5/4 12:02
  */
 public class MyApplicationPreparedEvent implements ApplicationListener<ApplicationPreparedEvent> {

     private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

     @Override
     public void onApplicationEvent(ApplicationPreparedEvent applicationPreparedEvent) {
         LOGGER.info("ApplicationPreparedEvent...");
     }

 }
