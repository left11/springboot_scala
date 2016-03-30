package com.example.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.net.UnknownHostException
import java.util.concurrent.TimeUnit

@Configuration class ServerConfig {
  @Bean
  @throws[UnknownHostException]
  def servletContainerFactory(@Value("${server.port:8888}") serverPort: Integer): EmbeddedServletContainerFactory = {
    val factory: UndertowEmbeddedServletContainerFactory = new UndertowEmbeddedServletContainerFactory
    factory.setPort(serverPort)
    factory.setSessionTimeout(10, TimeUnit.MINUTES)
    factory.setRegisterDefaultServlet(true)
    factory
  }
}
