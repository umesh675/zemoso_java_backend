package javapractice.string;

public class StringBuilderFun {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Rahul Singh");

        sb.append(" is kind man");
        System.out.println(sb);

        int firstSpace = sb.indexOf(" ");

        sb.insert(firstSpace, " Rajput");
        System.out.println(sb);

        int index = sb.indexOf("kind");

        sb.replace(index,index+4,"good");
        System.out.println(sb);

    }
}
