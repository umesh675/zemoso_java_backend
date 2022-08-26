package dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        //this is coach spring configuration factory design pattern
        ApplicationContext context = new ClassPathXmlApplicationContext("dependencyInjection.xml");

        Coach coach = context.getBean("baseball coach",Coach.class);

        System.out.println(coach.getDetails());
        System.out.println(coach.getDailyFortune());

        coach = (Coach) context.getBean("cricket coach"); //retrieve bean Return an instance, which may be shared or independent, of the specified bean
        System.out.println(coach.getDetails());
        System.out.println(coach.getDailyFortune());

        System.out.println(((CricketCoach)coach).getCoachEmail());
        System.out.println(((CricketCoach)coach).getCoachTeam());

        coach = context.getBean("badminton coach",Coach.class);

        System.out.println(((BadmintonCoach)coach).getEmail());
        System.out.println(((BadmintonCoach)coach).getTeam());

    }
}
