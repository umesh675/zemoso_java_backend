package assignment.assignment9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) throws IOException {

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        String input = inputReader.readLine();

        Pattern pattern  = Pattern.compile("^[A-Z](.)*");

        Pattern pattern1  = Pattern.compile(".*\\.$");

        Matcher matcher  = pattern.matcher(input);
        Matcher matcher1 = pattern1.matcher(input);

        if(matcher.matches() != true  ){
            System.out.println("Input String not start with capital letter");
        }
        else if(!matcher1.matches()){
            System.out.println("Input String not end with period");
        }
        else{
            System.out.println("Input String begins with a capital letter and ends with a period");
        }

    }
}
