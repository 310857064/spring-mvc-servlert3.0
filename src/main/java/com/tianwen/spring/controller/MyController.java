package com.tianwen.spring.controller;

import com.tianwen.spring.model.MyResult;
import com.tianwen.spring.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * wangjq
 * 2019年09月01日  18:55
 */
@RestController
@RequestMapping(value = "/controller")
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping(value = "/method1")
    public MyResult method1() {
        return myService.method1();
    }
}
