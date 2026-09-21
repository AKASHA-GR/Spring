package com.xworkz.initializer;

import com.xworkz.config.ApplicationConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public ApplicationWebInit(){
        System.out.println("ApplicationWebInit started.");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Running getRootConfigClasses().");
        return new Class[]{ApplicationConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("Running getServletConfigClasses().");
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("Running getServletMappings().");
        return new String[]{"/click"};
    }
}
