package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cdy
 * @version V1.0
 * @Description: 描述
 * @date 2018/4/18 18:07
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "MyTest";
    }
}
