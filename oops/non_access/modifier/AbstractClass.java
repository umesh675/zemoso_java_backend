package non_access.modifier;

abstract class AbstractClass {

    abstract public void a();
    abstract public void a(int b);

    public void printMessage(){
        System.out.println("Hi");
    }

    public static void c(){
        System.out.println("c in abstract class");
    }
}

class ChildClass extends AbstractClass{

    @Override
    public void a() {
        System.out.println("parameter less method");
    }

    @Override
    public void a(int b) {
        System.out.println("have one parameter");
    }

    public void printMessage(){          // method overriding
        super.printMessage();
    }

    public static void c(){
        System.out.println("c in child class");
    }
}


