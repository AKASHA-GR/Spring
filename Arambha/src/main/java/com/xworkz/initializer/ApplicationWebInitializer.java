package com.xworkz.initializer;

import com.xworkz.config.SetUpConfig;
import com.xworkz.config.StartUpConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public ApplicationWebInitializer(){
        System.out.println("The Akasha G R");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SetUpConfig.class, StartUpConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/hi","/home"};
    }
}
