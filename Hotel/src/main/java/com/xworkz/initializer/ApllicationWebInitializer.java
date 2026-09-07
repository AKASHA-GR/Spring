package com.xworkz.initializer;

import com.xworkz.config.HotelDBConfig;
import com.xworkz.config.HotelServerConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApllicationWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    public ApllicationWebInitializer(){
        System.out.println("The ApllicationWebInitializer is created.");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{HotelDBConfig.class, HotelServerConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/home","/about","/feedback"};
    }
}
