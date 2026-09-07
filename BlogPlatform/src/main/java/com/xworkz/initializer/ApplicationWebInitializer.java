package com.xworkz.initializer;

import com.xworkz.config.BlogDBConfig;
import com.xworkz.config.PrimaryConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{BlogDBConfig.class, PrimaryConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/home","/about","/tech"};
    }
}
