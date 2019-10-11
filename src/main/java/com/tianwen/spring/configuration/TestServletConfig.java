package com.tianwen.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * wangjq
 * 2019年09月01日  19:07
 */
@ComponentScan(value = "com.tianwen.spring", includeFilters = {@ComponentScan.Filter(classes = {Controller.class})})
@Configuration
public class TestServletConfig {

}
