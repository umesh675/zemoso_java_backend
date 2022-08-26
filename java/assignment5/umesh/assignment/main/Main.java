package assignment.assignment5.umesh.assignment.main;

import assignment.assignment5.umesh.assignment.data.Assignment6Part1;
import assignment.assignment5.umesh.assignment.singleton.Assignment6Part2;

public class Main {

    public static void main(String[] args) {

        Assignment6Part1 object1 = new Assignment6Part1();

        System.out.println("First Class ");
        object1.printMember();
        object1.printMember('G',5);

        Assignment6Part2 object2 = Assignment6Part2.initMember("Rahul");
        System.out.println("Second Class ");
        object2.printMember();
    }
}
