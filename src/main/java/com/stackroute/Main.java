package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/beans.xml");
        Movie movie=context.getBean("movie", Movie.class);
        movie.displayActor();
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/beans.xml"));
        Movie movie1=beanFactory.getBean("movie",Movie.class);
        movie1.displayActor();
        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        reader.loadBeanDefinitions(new FileSystemResource("src/beans.xml"));
        Movie movie2 =((DefaultListableBeanFactory)beanDefinitionRegistry).getBean(Movie.class);
        movie2.displayActor();
    }
}
