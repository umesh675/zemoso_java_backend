package javapractice.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class NameParser {

    public static void main(String[] args) throws IOException {

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        String fullName;
        String firstName;
        String lastName;

        System.out.println("Enter full name: ");
        fullName = inputReader.readLine();

        int indexOfSpace = fullName.indexOf(" ");

        firstName = fullName.substring(0,indexOfSpace);

        lastName = fullName.substring(indexOfSpace);

        firstName = firstName.toUpperCase();
        lastName = lastName.toLowerCase();

        System.out.println("Full Name: "+fullName+"\nFirst Name: "+firstName+"\nLast Name: "+lastName);
    }
}
