 package com.example.demo;


 import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

 /**
  * @author cdy
  * @version V1.0
  * @Description: 描述
  * @date 2018/5/4 12:02
  */
 public class MyApplicationReadyEvent implements ApplicationListener<ApplicationReadyEvent> {

     private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

     @Override
     public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
         LOGGER.info("ApplicationReadyEvent...");
     }

 }
