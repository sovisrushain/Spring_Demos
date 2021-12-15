package com.cisco.spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

//    @Override
//    protected Filter[] getServletFilters() {
//        Filter[] myFilters = new Filter[1];
//        myFilters[0] = new MyFilter();
//        return myFilters;
//    }

//    @Override
//    protected void customizeRegistration(ServletRegistration registration){
//        registration.setMultipartConfig(new MultipartConfigElement("/tmp"));
//    }
}
