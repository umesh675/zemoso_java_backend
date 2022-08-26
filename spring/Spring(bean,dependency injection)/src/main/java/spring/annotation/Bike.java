package spring.annotation;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bike implements Vehicle{

    private IEngine engine;

    @Value("${foo.vehicleNo}")
    private String vehicleNo;

    public Bike(){
        System.out.println("default bike constructor");
    }
    public Bike(IEngine engine) {
        this.engine = engine;
    }

    @PostConstruct
    public void initMethod(){
        System.out.println("bean initialize");
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply Break to bike");
    }

    @Override
    public void addEngine() {
        System.out.println(engine.startEngine());
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("destroy bean");
    }
}
