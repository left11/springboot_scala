package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

/**
 * Created by jinyong on 11/4/15.
 * email: jinyong1112@126.com
 */
@Configuration
public class ServerConfig {

    @Bean
    public EmbeddedServletContainerFactory servletContainerFactory(
            @Value("${server.port:8888}") final Integer serverPort
    ) throws UnknownHostException {
        UndertowEmbeddedServletContainerFactory factory = new UndertowEmbeddedServletContainerFactory();
//        JettyEmbeddedServletContainerFactory factory = new JettyEmbeddedServletContainerFactory();
        factory.setPort(serverPort);
        factory.setSessionTimeout(10, TimeUnit.MINUTES);
        factory.setRegisterDefaultServlet(true);
        return factory;
    }
}
