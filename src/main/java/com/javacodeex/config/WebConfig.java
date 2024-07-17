package com.javacodeex.config;

import com.javacodeex.interceprots.LoggingInterceptor;
import com.javacodeex.interceprots.ProductInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private LoggingInterceptor loggingInterceptor;

    @Autowired
    private ProductInterceptor productInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loggingInterceptor)
                .addPathPatterns("/api/**") // Define the URL patterns to be intercepted
                .excludePathPatterns("/api/auth/**"); // Define the URL patterns to be excluded from interception

        registry.addInterceptor(productInterceptor)
                .addPathPatterns("/product/**") // Define the URL patterns to be intercepted
                .excludePathPatterns("/api/auth/**");
    }
}
