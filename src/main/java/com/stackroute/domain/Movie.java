package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.rmi.MarshalledObject;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    private Actor actor;
    private ApplicationContext context = null;
    private BeanFactory beanFactory = null;
    public Movie(){}
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void displayActor()
    {
        actor.display();
    }

    public BeanFactory getBeanFactory()
    {
        return beanFactory;
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException
    {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String s)
    {
        System.out.println("Bean Name is "+s);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;

    }
    public ApplicationContext getContext() {
        return context;
    }
}
