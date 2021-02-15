package com.priyesh.springmvcinternationalization.config;
 
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
@Configuration
 
@ComponentScan("org.o7planning.springmvcinternationalization.*")
public class ApplicationContextConfig {
 
   @Bean(name = "viewResolver")
   public InternalResourceViewResolver getViewResolver() {
       InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
 
       viewResolver.setPrefix("/WEB-INF/pages/");
       viewResolver.setSuffix(".jsp");
 
       return viewResolver;
   }
    
   @Bean(name = "messageSource")
   public MessageSource getMessageResource()  {
       ReloadableResourceBundleMessageSource messageResource= new ReloadableResourceBundleMessageSource();
        
      
       messageResource.setBasename("classpath:i18n/messages");
       messageResource.setDefaultEncoding("UTF-8");
       return messageResource;
   }
    
   @Bean(name = "localeResolver")
   public LocaleResolver getLocaleResolver()  {
       CookieLocaleResolver resolver= new CookieLocaleResolver();
       resolver.setCookieDomain("myAppLocaleCookie");
     
       resolver.setCookieMaxAge(60*60);
       return resolver;
   }
    
 
}
