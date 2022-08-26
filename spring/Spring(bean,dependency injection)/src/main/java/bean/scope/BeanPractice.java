package bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xml.config.Coach;
import xml.config.CricketCoach;

public class BeanPractice {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean-application.xml");

        //spring create singleton bean bt default mean create one object and assign it to every reference
        Coach coach =  applicationContext.getBean("cricket coach",Coach.class);

        ((CricketCoach)coach).setTeam("Suresh");

        Coach coach1 = applicationContext.getBean("cricket coach",Coach.class);

        System.out.println(((CricketCoach)coach1).getTeam());
        System.out.println(coach+"\t"+coach1);

        //prototype bean means create new object every time

        System.out.println("\n\nBaseball coach start");

        coach = applicationContext.getBean("baseball coach",Coach.class);

        coach1 = applicationContext.getBean("baseball coach",Coach.class);

        System.out.println(coach+"\t"+coach1);
    }
}
