package interfaces;

public interface B {

    default void method1(){

        System.out.println("B");
    };

    public void method2();

}
