package spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-lifecycle.xml");

        BeanLifeCycle springLifeCycle = context.getBean("spring lifecycle", BeanLifeCycle.class);

        springLifeCycle.processData();

        ((ClassPathXmlApplicationContext)context).close();
    }
}
