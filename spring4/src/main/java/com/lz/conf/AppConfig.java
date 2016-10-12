package com.lz.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by lzadmin on 2016/3/31.
 */
//@Configuration
//@PropertySource("classpath:config.properties")
public class AppConfig {
    @Value("${jdbc.url}")
    private String url;

    @Bean
    public static PropertyPlaceholderConfigurer loadProperties(){
        PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
        ClassPathResource resource = new ClassPathResource("config.properties");
        configurer.setLocations(resource);
        return configurer;
    }
}
