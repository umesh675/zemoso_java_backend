package assignment.assignment5.umesh.assignment.singleton;

public class Assignment6Part2 {

    private String stringMember;

    public static Assignment6Part2 initMember(String stringMember){

        Assignment6Part2 object = new Assignment6Part2();

        object.stringMember = stringMember;

        return object;
    }

    public void printMember(){
        System.out.println(this.stringMember);
    }
}
