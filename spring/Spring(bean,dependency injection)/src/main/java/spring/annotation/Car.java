package spring.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("car")
//spring take spring id by default car (first small letter of class)
@Component
@Scope("prototype")
public class Car implements Vehicle{

    @Autowired
    @Qualifier("engine")
    private IEngine engine;

    //constructor dependency injection
//    @Autowired
//    public Car(IEngine engine){
//        this.engine = engine;
//    }

    public Car(){
        System.out.println("Car default constructor");
    }
    public Car(int a){
        System.out.println("parameterize constructor");
    }

    //setter dependency injection
//    @Autowired
//    public void setEngine(IEngine engine){
//        System.out.println("set engine");
//        this.engine = engine;
//    }

    @PostConstruct
    public void initMethod(){
        System.out.println("bean initialize");
    }
    @Override
    public void applyBreak() {
        System.out.println("Apply car break");
    }

    @Override
    public void addEngine() {
        System.out.println(engine.startEngine());
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("destroy bean");
    }
}
