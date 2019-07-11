package com.stackroute;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/beans.xml");
        Movie movie = applicationContext.getBean("movie",Movie.class);
        movie.displayActor();
         Movie movie2 = applicationContext.getBean("movie2",Movie.class);
        movie2.displayActor();
    }
}
