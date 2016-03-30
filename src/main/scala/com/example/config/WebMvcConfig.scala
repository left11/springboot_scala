package com.example.config

import java.nio.charset.Charset

import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.context.annotation.{Bean, Configuration}
import org.springframework.http.converter.json.{Jackson2ObjectMapperBuilder, MappingJackson2HttpMessageConverter}
import org.springframework.http.converter.{HttpMessageConverter, StringHttpMessageConverter}
import org.springframework.web.servlet.config.annotation._

@Configuration
class WebMvcConfig extends WebMvcConfigurerAdapter {
  val CLASSPATH_RESOURCE_LOCATIONS = Array("classpath:/META-INF/resources/", "classpath:/resources/",
    "classpath:/static/", "classpath:/public/")

  override def configureMessageConverters(converters: java.util.List[HttpMessageConverter[_]]) {
    converters.add(jackson2HttpMessageConverter)
    converters.add(stringHttpMessageConverter)
  }

  @Bean def jackson2HttpMessageConverter: MappingJackson2HttpMessageConverter = {
    val converter: MappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter
    converter.setObjectMapper(new Jackson2ObjectMapperBuilder().modules(new DefaultScalaModule).build())
    converter
  }

  @Bean def stringHttpMessageConverter: StringHttpMessageConverter = {
    new StringHttpMessageConverter(Charset.forName("UTF-8"))
  }

  override def addResourceHandlers(registry: ResourceHandlerRegistry) {
    registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS: _*)
  }

  override def configureDefaultServletHandling(configurer: DefaultServletHandlerConfigurer): Unit = {
    configurer.enable()
  }
}
