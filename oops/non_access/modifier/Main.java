package non_access.modifier;

public class Main {

    public static void main(String[] args) {

        AbstractClass abstractClass = new ChildClass();
        ChildClass childClass = new ChildClass();

        abstractClass.a();
        abstractClass.a(5);
        abstractClass.printMessage();
        abstractClass.c();

        childClass.c();

    }
}
