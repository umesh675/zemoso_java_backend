package polymorphism;


class A{

    //public int sum(int a,int b){
      //  return (a+b);
    //}

    //public float sum(int a,int b)  it gives an error because compiler signify a method via method signature

    public double sum(double a,double b){
        return (a+b);
    }

   // public void printMess(){
     //   System.out.println("A");
    //}
}

class B extends A{

    public void printMess(){
        System.out.println("B");
    }
}
public class MethodOverloading {

    public static void main(String[] args) {

        A a = new B();

        System.out.println(a.sum('a','b'));

        System.out.println(a.sum(1l,2l));

        ((B) a).printMess();
    }
}
