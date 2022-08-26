package xml.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        /*
        one way to call method
        BaseballCoach baseballCoach = new BaseballCoach();
        baseballCoach.getDetails();

        but this is a bad way for implement because here we implement hard coupling
         */

        /*
        Second way to call method
        Coach coach = new BaseballCoach();
        coach.getDetails();

        using interface  interact with different class
         */

        //third way using spring config

        //1. create spring contains and load the spring configure xml file
        //when spring configuration file execute then it call object of beans we create
        //the file execute top to bottom so it also affect which bean execute first or which object call.
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //2 create an object of a class using beans or retrieve bean
        Coach coach = context.getBean("baseball coach",Coach.class);
        coach.getDetails();

        coach = context.getBean("cricket coach",Coach.class);
        coach.getDetails();
    }
}
