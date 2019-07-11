package com.stackroute;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.security.cert.X509Certificate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/beans.xml");
       Movie movie = applicationContext.getBean("movie",Movie.class);
       ApplicationContext applicationContext1 = movie.getContext();
       Movie movie1 = applicationContext1.getBean("movie",Movie.class);
        System.out.println("Through Application Context");
       movie1.displayActor();
        BeanFactory beanFactory = new FileSystemXmlApplicationContext("src/beans.xml");
        Movie movie2 = beanFactory.getBean("movie",Movie.class);
        BeanFactory beanFactory1 = movie2.getBeanFactory();
        Movie movie3 = beanFactory1.getBean("movie",Movie.class);
        System.out.println("Through Bean Factory");
        movie3.displayActor();
    }
}
