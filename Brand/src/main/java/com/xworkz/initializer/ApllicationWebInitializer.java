package com.xworkz.initializer;

import com.xworkz.config.BrandDBConfig;
import com.xworkz.config.BrandServerConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApllicationWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{BrandServerConfig.class, BrandDBConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/home","/about"};
    }
}
