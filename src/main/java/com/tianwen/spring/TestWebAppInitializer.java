package com.tianwen.spring;

import com.tianwen.spring.configuration.TestRootConfig;
import com.tianwen.spring.configuration.TestServletConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * wangjq
 * 2019年10月09日  23:25
 */
public class TestWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{TestRootConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{TestServletConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
