package assignment.assignment6.thirdpart;

import java.util.Scanner;

public class NameDemo {

    public static void main(String[] args) {

        Scanner readInput = new Scanner(System.in);

        int input;

        System.out.println("Enter size of array: ");

        input = readInput.nextInt();
        readInput.nextLine();

        //3 part
        for(int i = 0;i<input ;i++){

            System.out.println("Enter name ");
            new Name(readInput.nextLine());
        }

        //4 part
        Name nameList[] = new Name[input];

        for(int i = 0 ;i<input;i++){
            nameList[i] = new Name(readInput.nextLine());
        }
    }
}
