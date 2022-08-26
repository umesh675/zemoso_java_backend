package spring.annotation;

import org.springframework.stereotype.Component;

//@Component
public class Engine implements IEngine{

    @Override
    public String startEngine() {
        return "start Engine";
    }
}
