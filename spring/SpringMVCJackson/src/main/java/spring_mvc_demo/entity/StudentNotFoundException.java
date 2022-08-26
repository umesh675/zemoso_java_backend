package spring_mvc_demo.entity;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String msg){
        super(msg);
    }
}
