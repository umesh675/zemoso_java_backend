package assignment.assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAbsolutePath {

    public static void main(String[] args) {

        String currentWorkingDir = System.getProperty("user.dir");
        System.out.println("Parent Directory: "+currentWorkingDir);

        Scanner checkFile;
        Scanner input  = new Scanner(System.in);
        char ch;
        System.out.println("want to check file name Enter y/n ");
        ch = input.nextLine().charAt(0);

        while (ch == 'y') {

            System.out.println("Enter file Name");
            String fileName = input.nextLine();

            File file = new File(fileName);

            try{
                checkFile = new Scanner(file.getAbsoluteFile());
                System.out.println(file.getAbsoluteFile());
                checkFile.close();
            }
            catch (FileNotFoundException ex){
                System.out.println("file not found");
            }

            System.out.println("want to check file name Enter y/n ");
            ch = input.nextLine().charAt(0);

        }


    }
}
