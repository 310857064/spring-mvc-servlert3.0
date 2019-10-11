package com.tianwen.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * wangjq
 * 2019年09月01日  19:07
 */
//@ComponentScan(value = "com.tianwen.spring", excludeFilters = {@ComponentScan.Filter(classes = {Controller.class, TestServletConfig.class})})
@ComponentScan(value = "com.tianwen.spring", excludeFilters = {@ComponentScan.Filter(classes = {Controller.class})})
@Configuration
@EnableWebMvc
public class TestRootConfig extends WebMvcConfigurerAdapter {


}
