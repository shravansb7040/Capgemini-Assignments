package com.priyesh.springmvcinternationalization.config;
 
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
 
@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {
 
   // Static Resource Config
   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
 
       // Default..
   }
 
   @Override
   public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
       configurer.enable();
   }
 
   @Override
   public void addInterceptors(InterceptorRegistry registry) {
       LocaleChangeInterceptor localeInterceptor = new LocaleChangeInterceptor();
       localeInterceptor.setParamName("lang");
      
      
       registry.addInterceptor(localeInterceptor).addPathPatterns("/*");
   }
  
}
