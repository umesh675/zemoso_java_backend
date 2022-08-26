package spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationDemo {

    public static void main(String[] args) {

        //config the file
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation.xml");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BikeConfig.class);

        System.out.println("retrieve bean");
        //retrieve the bean
        Bike vehicle = context.getBean("bike",Bike.class);

        vehicle.applyBreak();
        vehicle.addEngine();
        System.out.println(vehicle.getVehicleNo());
        context.close();
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            public void run() {
//                context.close();
//            }});
    }
}
