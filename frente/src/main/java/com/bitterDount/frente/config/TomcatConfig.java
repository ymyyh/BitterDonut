package com.bitterDount.frente.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.AbstractServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

//
//@Configuration
//public class TomcatConfig {
//    @Bean
//    public EmbeddedServletContainerFactory embeddedServletContainerFactory() {
//        ConfigurableEmbeddedServletContainer factory = new TomcatEmbeddedServletContainerFactory();
//        factory.setDocumentRoot(new File("D:\\Study\\learn-springboot\\module1\\src\\main\\webapp\\"));
//        return (EmbeddedServletContainerFactory) factory;
//    }
//}
@Configuration
public class TomcatConfig {
    @Value("H:\\BitterDonut\\frente\\src\\main\\webapp")
    private String rootDoc;
    @Bean
    public AbstractServletWebServerFactory embeddedServletContainerFactory() {

        TomcatServletWebServerFactory tomcatServletWebServerFactory = new TomcatServletWebServerFactory();
        tomcatServletWebServerFactory.setDocumentRoot(
                new File(rootDoc));
        return  tomcatServletWebServerFactory;
    }
}