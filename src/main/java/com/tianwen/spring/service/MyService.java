package com.tianwen.spring.service;

import com.tianwen.spring.model.MyResult;
import org.springframework.stereotype.Service;

/**
 * wangjq
 * 2019年09月01日  18:58
 */
@Service
public class MyService {

    public MyResult method1() {
        return new MyResult(1, "wang");
    }
}
