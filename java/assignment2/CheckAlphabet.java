package assignment.assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class CheckAlphabet {

    public static void main(String[] args) throws IOException {

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        String input = inputReader.readLine();

        if(inputContainsAllAlphabet(input)){
            System.out.println("Input String Contains All Alphabet");
        }

        else{
            System.out.println("Input String does not contains all alphabet ");
        }


    }

    static boolean inputContainsAllAlphabet(String input){

       // boolean check26Alphabet[] = new boolean[26];

        HashSet<Character> check26Alphabet = new HashSet<>();

        int countAlphabet = 0;
        input = input.toLowerCase();

        for(int i = 0;i<input.length() ;i++){

            if(!check26Alphabet.contains(input.charAt(i))){
                check26Alphabet.add(input.charAt(i)) ;

                countAlphabet++;
            }

            if(countAlphabet == 26)
                return true;
        }

        return false;
    }
}

// time complexity o(string length) or space complexity o(1)
