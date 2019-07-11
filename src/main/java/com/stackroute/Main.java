package com.stackroute;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/beans.xml");
        Movie movie = applicationContext.getBean("movieA",Movie.class);
        movie.displayActor();
        Movie movie1 = applicationContext.getBean("movieB",Movie.class);
        System.out.println(movie==movie1);

    }
}
