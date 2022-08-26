package pract1;

class Fan{

    private boolean isOn; // instance variable

    static int b ; //static variable;

    public Fan(){} // non parametrized constructor

    public Fan(boolean isOn){  // parameterized constructor(have argument)
        this.isOn = isOn;
    }
    public void setOn(){
        int a = 5; // local variable
        this.isOn = true;
        System.out.println("fan is on");
    }

    public void setOff(){
        this.isOn = false;
        System.out.println("fan is off");
    }
}
public class First_Prc {

    public static void main(String[] args) {

        Fan myFan; // reference of class

        myFan = new Fan(); // object of a class

        myFan.setOn();
        myFan.setOff();

        System.out.println(Fan.b); // we can access static variable via class name also
    }
}
