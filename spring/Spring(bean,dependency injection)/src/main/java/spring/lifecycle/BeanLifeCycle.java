package spring.lifecycle;

public class BeanLifeCycle {

    public void beanInitMethod(){
        System.out.println("Bean Initialized Method");
    }

    public void processData(){
        System.out.println("processing function");
    }
    public void beanDestroyMethod(){
        System.out.println("Bean Destruction Method");
    }
}
