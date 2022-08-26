package interfaces;

public interface A {

    int a =5;

     default void method1(){
         System.out.println("A");
     };

    public void method2();
}

