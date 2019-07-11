package com.stackroute;
import com.stackroute.domain.BeanLifecycleDemoBean;
import com.stackroute.domain.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.security.cert.X509Certificate;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/beans.xml");
       Movie movie = applicationContext.getBean("movie",Movie.class);
       movie.displayActor();
        BeanLifecycleDemoBean beanLifecycleDemoBean = new BeanLifecycleDemoBean();
        BeanPostProcessorDemoBean beanPostProcessorDemoBean = new BeanPostProcessorDemoBean();
        applicationContext.close();
    }
}
